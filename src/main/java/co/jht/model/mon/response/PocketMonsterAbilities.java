package co.jht.model.mon.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PocketMonsterAbilities {
    @JsonProperty("ability") private PocketMonsterAbility pokeAbility;

    public PocketMonsterAbility getPokeAbility() {
        return pokeAbility;
    }

    public void setPokeAbility(PocketMonsterAbility pokeAbility) {
        this.pokeAbility = pokeAbility;
    }

    @Override
    public String toString() {
        return "PocketMonsterAbilities{" +
                "pokeAbility=" + pokeAbility +
                '}';
    }
}