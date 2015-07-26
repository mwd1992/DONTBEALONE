package com.dont.be.alone.service;

import com.dont.be.alone.domain.Detective;
import com.dont.be.alone.security.UserAuthority;
import com.dont.be.alone.service.DetectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class DetectiveDetailsService implements UserDetailsService{

    @Autowired
    private DetectiveRepository detectiveRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Detective> detective;
        UserDetails user;
        if (username.contains("@"))
            detective = Optional.ofNullable(detectiveRepository.findByEmail(username));
        else
            detective = Optional.ofNullable(detectiveRepository.findByUsername(username));
        if (detective.isPresent());
        {
            user = new User(detective.get().getUsername(), detective.get().getPassword(), true,
                    true, true, true, Arrays.asList(new UserAuthority("ROLE_USER")));
        }
        return user;
    }
}
