package co.jht.model.response;

import java.util.List;

public class PocketMonster {
    private Long pokeId;
    private String pokeName;
    private Long pokeHeight;
    private List<PocketMonsterTypes> pokeTypes;
    private List<PocketMonsterStats> pokeBaseStats;
    private List<PocketMonsterAbilities> pokeAbilities;
    private List<PocketMonsterMoves> pokeMoves;
    private PocketMonsterSprite pokeSprite;

    public Long getPokeId() {
        return pokeId;
    }

    public void setPokeId(Long pokeId) {
        this.pokeId = pokeId;
    }

    public String getPokeName() {
        return pokeName;
    }

    public void setPokeName(String pokeName) {
        this.pokeName = pokeName;
    }

    public Long getPokeHeight() {
        return pokeHeight;
    }

    public void setPokeHeight(Long pokeHeight) {
        this.pokeHeight = pokeHeight;
    }

    public List<PocketMonsterTypes> getPokeTypes() {
        return pokeTypes;
    }

    public void setPokeTypes(List<PocketMonsterTypes> pokeTypes) {
        this.pokeTypes = pokeTypes;
    }

    public List<PocketMonsterStats> getPokeBaseStats() {
        return pokeBaseStats;
    }

    public void setPokeBaseStats(List<PocketMonsterStats> pokeBaseStats) {
        this.pokeBaseStats = pokeBaseStats;
    }

    public List<PocketMonsterAbilities> getPokeAbilities() {
        return pokeAbilities;
    }

    public void setPokeAbilities(List<PocketMonsterAbilities> pokeAbilities) {
        this.pokeAbilities = pokeAbilities;
    }

    public List<PocketMonsterMoves> getPokeMoves() {
        return pokeMoves;
    }

    public void setPokeMoves(List<PocketMonsterMoves> pokeMoves) {
        this.pokeMoves = pokeMoves;
    }

    public PocketMonsterSprite getPokeSprite() {
        return pokeSprite;
    }

    public void setPokeSprite(PocketMonsterSprite pokeSprite) {
        this.pokeSprite = pokeSprite;
    }

    @Override
    public String toString() {
        return "PocketMonster{" +
                "pokeId=" + pokeId +
                ", pokeName='" + pokeName + '\'' +
                ", pokeHeight=" + pokeHeight +
                ", pokeTypes=" + pokeTypes +
                ", pokeBaseStats=" + pokeBaseStats +
                ", pokeAbilities=" + pokeAbilities +
                ", pokeMoves=" + pokeMoves +
                ", pokeSprite=" + pokeSprite +
                '}';
    }
}