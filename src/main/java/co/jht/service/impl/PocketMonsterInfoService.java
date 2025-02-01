package co.jht.service.impl;

import co.jht.model.mon.response.PocketMonster;
import co.jht.repository.PokeAPIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PocketMonsterInfoService {

    private final PokeAPIRepository pokeAPIRepository;

    @Autowired
    public PocketMonsterInfoService(PokeAPIRepository pokeAPIRepository) {
        this.pokeAPIRepository = pokeAPIRepository;
    }

    public PocketMonster getPocketMonsterInfo(Long id) throws IOException, InterruptedException {
        return pokeAPIRepository.getPocketMonsterById(id);
    }
}