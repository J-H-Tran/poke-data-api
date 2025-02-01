package co.jht.dto;

import co.jht.model.mon.response.PocketMonsterSprites;
import co.jht.model.mon.response.PocketMonsterAbilities;
import co.jht.model.mon.response.PocketMonsterMoves;
import co.jht.model.mon.response.PocketMonsterStats;
import co.jht.model.mon.response.PocketMonsterTypes;

import java.util.List;

public class PocketMonsterDTO {
    private Long id;
    private String name;
    private Long height;
    private List<PocketMonsterTypes> typesList;
    private List<PocketMonsterStats> statsList;
    private List<PocketMonsterAbilities> abilitiesList;
    private List<PocketMonsterMoves> movesList;
    private PocketMonsterSprites sprite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public List<PocketMonsterTypes> getTypesList() {
        return typesList;
    }

    public void setTypesList(List<PocketMonsterTypes> typesList) {
        this.typesList = typesList;
    }

    public List<PocketMonsterStats> getStatsList() {
        return statsList;
    }

    public void setStatsList(List<PocketMonsterStats> statsList) {
        this.statsList = statsList;
    }

    public List<PocketMonsterAbilities> getAbilitiesList() {
        return abilitiesList;
    }

    public void setAbilitiesList(List<PocketMonsterAbilities> abilitiesList) {
        this.abilitiesList = abilitiesList;
    }

    public List<PocketMonsterMoves> getMovesList() {
        return movesList;
    }

    public void setMovesList(List<PocketMonsterMoves> movesList) {
        this.movesList = movesList;
    }

    public PocketMonsterSprites getSprite() {
        return sprite;
    }

    public void setSprite(PocketMonsterSprites sprite) {
        this.sprite = sprite;
    }
}