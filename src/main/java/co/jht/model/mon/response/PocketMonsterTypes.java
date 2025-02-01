package co.jht.model.mon.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PocketMonsterTypes {
    @JsonProperty("type")
    private PocketMonsterType pokeType;

    public PocketMonsterType getPokeType() {
        return pokeType;
    }

    public void setPokeType(PocketMonsterType pokeType) {
        this.pokeType = pokeType;
    }

    @Override
    public String toString() {
        return "PocketMonsterTypes{" +
                "pokeType=" + pokeType +
                '}';
    }
}