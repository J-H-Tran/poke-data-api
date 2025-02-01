package co.jht.model.mon.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PocketMonster {
    @JsonProperty("id") private Long pokeId;
    @JsonProperty("name") private String pokeName;
    @JsonProperty("height") private Long pokeHeight;
    @JsonProperty("types") private List<PocketMonsterTypes> pokeTypes;
    @JsonProperty("stats") private List<PocketMonsterStats> pokeBaseStats;
    @JsonProperty("abilities") private List<PocketMonsterAbilities> pokeAbilities;
    @JsonProperty("moves") private List<PocketMonsterMoves> pokeMoves;
    @JsonProperty("sprites") private PocketMonsterSprites pokeSprite;

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

    public PocketMonsterSprites getPokeSprite() {
        return pokeSprite;
    }

    public void setPokeSprite(PocketMonsterSprites pokeSprite) {
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