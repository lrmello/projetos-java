package com.rd.Marvel.service;

import com.rd.Marvel.domain.dto.request.CreateHeroDto;
import com.rd.Marvel.domain.model.SuperHero;
import com.rd.Marvel.repository.HeroRepository;
import com.rd.Marvel.repository.SecretIndetityRepository;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class HeroService {

    @NonNull
    private HeroRepository heroRepository;

    @NonNull
    private SecretIndetityRepository identityRepository;

    public List<SuperHero> getAll(){
        return heroRepository.findAll();
    }

    public ResponseEntity<Object> registerHero(CreateHeroDto heroDto){

        var heroesWithSameName = heroRepository.findAll().stream().filter(h -> h.getName().equalsIgnoreCase(hero.getName())).toList();
        if(heroesWithSameName.size() > 0) {
            return null;
        }

        toHero(heroDto);
        var savedHero = heroRepository.save(heroDto);

    }

}
