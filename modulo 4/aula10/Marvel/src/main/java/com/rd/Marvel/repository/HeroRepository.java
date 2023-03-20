package com.rd.Marvel.repository;

import com.rd.Marvel.domain.model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<SuperHero,Long> {
}
