package co.jht.model.response;

public class PocketMonsterMoves {
    private PocketMonsterMove pokeMove;

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

class PocketMonsterMove {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PocketMonsterMove{" +
                "name='" + name + '\'' +
                '}';
    }
}