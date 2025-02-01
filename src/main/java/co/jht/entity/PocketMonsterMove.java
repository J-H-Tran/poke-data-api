package co.jht.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PocketMonsterMove {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}