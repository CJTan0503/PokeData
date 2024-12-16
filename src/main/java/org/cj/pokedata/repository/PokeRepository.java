package org.cj.pokedata.repository;

import org.cj.pokedata.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokeRepository extends JpaRepository<Pokemon, Integer> {

    Pokemon findByName(String name);
}
