package org.cj.pokedata.controller;

import org.cj.pokedata.entity.Pokemon;
import org.cj.pokedata.service.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokeController {

    @Autowired
    private PokeService service;

    @PostMapping("/addPokemon")
    public Pokemon savePokemon(@RequestBody Pokemon pokemon) {
        return service.savePokemon(pokemon);
    }

    @PostMapping("/addPokemons")
    public List<Pokemon> savePokemons(@RequestBody List<Pokemon> pokemons) {
        return service.savePokemons(pokemons);
    }

    @GetMapping("/pokemons")
    public List<Pokemon> getPokemons() {
        return service.getPokemons();
    }

    @GetMapping("/pokemon/id/{id}")
    public Pokemon getPokemonById(@PathVariable int id) {
        return service.getPokemonById(id);
    }

    @GetMapping("/pokemon/name/{name}")
    public Pokemon getPokemonByName(@PathVariable String name) {
        return service.getPokemonByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePokemon(@PathVariable int id) {
        return service.deletePokemon(id);
    }

    @PutMapping("/update")
    public Pokemon updatePokemon(@RequestBody Pokemon pokemon) {
        return service.updatePokemon(pokemon);
    }


}
