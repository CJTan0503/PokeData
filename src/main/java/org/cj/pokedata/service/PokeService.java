package org.cj.pokedata.service;

import org.cj.pokedata.entity.Pokemon;
import org.cj.pokedata.repository.PokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokeService {

    @Autowired
    private PokeRepository repository;

    public Pokemon savePokemon(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    public List<Pokemon> savePokemons(List<Pokemon> pokemons) {
        return repository.saveAll(pokemons);
    }

    public List<Pokemon> getPokemons() {
        return repository.findAll();
    }

    public Pokemon getPokemonById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Pokemon getPokemonByName(String name) {
        return repository.findByName(name);
    }

    public String deletePokemon(int id) {
        repository.deleteById(id);
        return "Pokemon removed !! " + id;
    }

    public Pokemon updatePokemon(Pokemon pokemon) {
        Pokemon existingPokemon = repository.findById(pokemon.getId()).orElse(null);
        existingPokemon.setName(pokemon.getName());
        existingPokemon.setType1(pokemon.getType1());
        existingPokemon.setType2(pokemon.getType2());
        existingPokemon.setTotal(pokemon.getTotal());
        existingPokemon.setHp(pokemon.getHp());
        existingPokemon.setAttack(pokemon.getAttack());
        existingPokemon.setDefense(pokemon.getDefense());
        existingPokemon.setSpAtk(pokemon.getSpAtk());
        existingPokemon.setSpDef(pokemon.getSpDef());
        existingPokemon.setSpeed(pokemon.getSpeed());
        existingPokemon.setGeneration(pokemon.getGeneration());
        existingPokemon.setLegendary(pokemon.isLegendary());
        return repository.save(existingPokemon);
    }
}
