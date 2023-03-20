package com.rd.Marvel.repository;

import com.rd.Marvel.domain.model.SecretIndetity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretIndetityRepository extends JpaRepository<SecretIndetity,Long> {
}
