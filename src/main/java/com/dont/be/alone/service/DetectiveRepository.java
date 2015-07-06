package com.dont.be.alone.service;

import com.dont.be.alone.domain.Detective;
import org.springframework.data.repository.Repository;

public interface DetectiveRepository extends Repository<Detective, Long> {
    public Detective findByUsername(String username);

    public Detective save(Detective detective);
}
