package com.dont.be.alone.service;

import com.dont.be.alone.domain.Detective;
import org.springframework.data.repository.Repository;

public interface DetectiveRepository extends Repository<Detective, Long> {

    public Detective findByUsername(String username);

    public Detective findByEmail(String email);

    public Detective findByUsernameAndPassword(String username, String password);

    public Detective findByEmailAndPassword(String email, String password);

    public Detective save(Detective detective);
}
