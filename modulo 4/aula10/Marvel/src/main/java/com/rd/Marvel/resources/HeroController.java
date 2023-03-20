package com.rd.Marvel.resources;

import com.rd.Marvel.domain.model.SuperHero;
import com.rd.Marvel.service.HeroService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/heroes")
public class HeroController {

    @NonNull
    private HeroService heroService;

    private static final double PI = 3.14159265;

    // substituido pela lombok
    // public HeroController(HeroRepository heroRepository) {
    //      this.heroRepository = heroRepository;
    // }

    @PostMapping
    public ResponseEntity<ResponseEntity<Object>> registerNewHero(@RequestBody SuperHero hero) {
        var savedHero = heroService.registerHero(hero);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedHero);
    }

    @GetMapping
    public ResponseEntity<List<SuperHero>> getAllHeroes() {
        SuperHero hero = new SuperHero();
        var savedHero = heroService.registerHero(hero);

        if(savedHero == null)
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();

        List<SuperHero> heroes = null;
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(heroes);
    }
}