package co.jht.model.response;

public class PocketMonsterTypes {
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

class PocketMonsterType {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PocketMonsterType{" +
                "name='" + name + '\'' +
                '}';
    }
}