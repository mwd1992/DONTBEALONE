package com.dont.be.alone.service;

import com.dont.be.alone.domain.ClientDetailsImpl;
import org.springframework.data.repository.Repository;

public interface ClientDetailRepository  extends Repository<ClientDetailsImpl, Long>{

    public ClientDetailsImpl findByClientId(String clientId);
}
