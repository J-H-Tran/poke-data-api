package co.jht.service.impl;

import co.jht.dto.PocketMonsterDTO;
import co.jht.model.mon.response.PocketMonster;
import co.jht.repository.PocketMonsterRepository;
import co.jht.repository.PokeAPIRepository;
import co.jht.service.PocketMonsterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PocketMonsterInfoServiceImpl implements PocketMonsterInfoService {

    private final PocketMonsterRepository pocketMonsterRepository;
    private final PokeAPIRepository pokeAPIRepository;

    @Autowired
    public PocketMonsterInfoServiceImpl(
            PocketMonsterRepository pocketMonsterRepository,
            PokeAPIRepository pokeAPIRepository
    ) {
        this.pocketMonsterRepository = pocketMonsterRepository;
        this.pokeAPIRepository = pokeAPIRepository;
    }

    @Cacheable(value = "pocketMonsterCache", key = "#id")
    public PocketMonsterDTO getPocketMonsterInfo(Long id) throws IOException, InterruptedException {
        PocketMonster pocketMonster = pokeAPIRepository.getPocketMonsterById(id);

        if (pocketMonster == null) {
            throw new IOException("Pocket monster not found.");
        }
        return convertToDTO(pocketMonster);
    }

//    public PocketMonsterDTO getPocketMonsterInfo(Long id) throws IOException, InterruptedException {
//        PocketMonster pocketMonster = pocketMonsterRepository.findById(id)
//                .orElseThrow(() -> new IOException("Pocket monster not found."));
//        return convertToDTO(pocketMonster);
//    }

    private PocketMonsterDTO convertToDTO(PocketMonster pocketMonster) {
        PocketMonsterDTO dto = new PocketMonsterDTO();

        dto.setId(pocketMonster.getPokeId());
        dto.setName(pocketMonster.getPokeName());
        dto.setHeight(pocketMonster.getPokeHeight());
        dto.setTypesList(pocketMonster.getPokeTypes());
        dto.setStatsList(pocketMonster.getPokeBaseStats());
        dto.setAbilitiesList(pocketMonster.getPokeAbilities());
        dto.setMovesList(pocketMonster.getPokeMoves());
        dto.setSprite(pocketMonster.getPokeSprite());

        return dto;
    }
}