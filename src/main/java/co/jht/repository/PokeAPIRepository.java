package co.jht.repository;

import co.jht.model.mon.response.PocketMonster;

import java.io.IOException;

public interface PokeAPIRepository {
    PocketMonster getPocketMonsterById(Long id) throws IOException, InterruptedException;
}