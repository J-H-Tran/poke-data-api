package co.jht.model.mon.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PocketMonsterMoves {
    @JsonProperty("move") private PocketMonsterMove pokeMove;

    public PocketMonsterMove getPokeMove() {
        return pokeMove;
    }

    public void setPokeMove(PocketMonsterMove pokeMove) {
        this.pokeMove = pokeMove;
    }

    @Override
    public String toString() {
        return "PocketMonsterMoves{" +
                "pokeMove=" + pokeMove +
                '}';
    }
}