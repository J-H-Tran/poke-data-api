package co.jht.model.response;

public class PocketMonsterAbilities {
    private PocketMonsterAbility pokeAbility;

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

class PocketMonsterAbility {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PocketMonsterAbility{" +
                "name='" + name + '\'' +
                '}';
    }
}