package co.jht.service.impl;

import co.jht.dto.PocketMonsterDTO;
import co.jht.entity.PocketMonsterEntity;
import co.jht.model.mon.response.PocketMonster;
import co.jht.model.mon.response.PocketMonsterAbilities;
import co.jht.model.mon.response.PocketMonsterAbility;
import co.jht.model.mon.response.PocketMonsterMove;
import co.jht.model.mon.response.PocketMonsterMoves;
import co.jht.model.mon.response.PocketMonsterSprites;
import co.jht.model.mon.response.PocketMonsterStats;
import co.jht.model.mon.response.PocketMonsterType;
import co.jht.model.mon.response.PocketMonsterTypes;
import co.jht.repository.PocketMonsterRepository;
import co.jht.repository.PokeAPIRepository;
import co.jht.service.PocketMonsterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

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
        pocketMonsterRepository.save(convertToEntity(pocketMonster));
        return convertToDTO(pocketMonster);
    }

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

    private PocketMonsterEntity convertToEntity(PocketMonster pocketMonster) {
        PocketMonsterEntity entity = new PocketMonsterEntity();

        entity.setPokeId(pocketMonster.getPokeId());
        entity.setName(pocketMonster.getPokeName());
        entity.setHeight(pocketMonster.getPokeHeight());
//        entity.setTypes(getTypeNames(pocketMonster.getPokeTypes()));
//        entity.setStats(getStats(pocketMonster.getPokeBaseStats()));
//        entity.setAbilities(getAbilityNames(pocketMonster.getPokeAbilities()));
//        entity.setMoves(getMoveNames(pocketMonster.getPokeMoves()));
//        entity.setSprites(getSprites(pocketMonster.getPokeSprite()));

        return entity;
    }

    private String getTypeNames(List<PocketMonsterTypes> pokeTypes) {
        return pokeTypes.stream()
                .map(PocketMonsterTypes::getPokeType)
                .map(PocketMonsterType::getName)
                .collect(Collectors.joining(","));
    }

    private String getStats(List<PocketMonsterStats> pokeStats) {
        return pokeStats.stream()
                .map(stat -> stat.getBaseStat() + "-" + stat.getPokeStat().getName())
                .collect(Collectors.joining(","));
    }

    private String getAbilityNames(List<PocketMonsterAbilities> pokeAbilities) {
        return pokeAbilities.stream()
                .map(PocketMonsterAbilities::getPokeAbility)
                .map(PocketMonsterAbility::getName)
                .collect(Collectors.joining(","));
    }

    private String getMoveNames(List<PocketMonsterMoves> pokeMoves) {
        return pokeMoves.stream()
                .map(PocketMonsterMoves::getPokeMove)
                .map(PocketMonsterMove::getName)
                .collect(Collectors.joining(","));
    }

    private String getSprites(PocketMonsterSprites pokeSprites) {
        return pokeSprites.getFrontDefault() + pokeSprites.getFrontShiny();
    }

}