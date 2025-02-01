package co.jht.model.response;

public class PocketMonsterStats {
    private Long baseStat;
    private PocketMonsterStat pokeStat;

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

class PocketMonsterStat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PocketMonsterStat{" +
                "name='" + name + '\'' +
                '}';
    }
}