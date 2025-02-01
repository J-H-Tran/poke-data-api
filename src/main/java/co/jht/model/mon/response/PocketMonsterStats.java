package co.jht.model.mon.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PocketMonsterStats {
    @JsonProperty("base_stat") private Long baseStat;
    @JsonProperty("stat") private PocketMonsterStat pokeStat;

    public Long getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(Long baseStat) {
        this.baseStat = baseStat;
    }

    public PocketMonsterStat getPokeStat() {
        return pokeStat;
    }

    public void setPokeStat(PocketMonsterStat pokeStat) {
        this.pokeStat = pokeStat;
    }

    @Override
    public String toString() {
        return "PocketMonsterStats{" +
                "baseStat=" + baseStat +
                ", pokeStat=" + pokeStat +
                '}';
    }
}