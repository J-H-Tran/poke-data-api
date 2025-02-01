package co.jht.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PocketMonsterStat {
    private int baseStat;
    private String name;

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}