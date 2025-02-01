package co.jht.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class PocketMonster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long height;
    @ElementCollection
    private List<PocketMonsterType> types;
    @ElementCollection
    private List<PocketMonsterStat> stats;
    @ElementCollection
    private List<PocketMonsterAbility> abilities;
    @ElementCollection
    private List<PocketMonsterMove> moves;
    @Embedded
    private PocketMonsterSprite sprites;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public List<PocketMonsterType> getTypes() {
        return types;
    }

    public void setTypes(List<PocketMonsterType> types) {
        this.types = types;
    }

    public List<PocketMonsterStat> getStats() {
        return stats;
    }

    public void setStats(List<PocketMonsterStat> stats) {
        this.stats = stats;
    }

    public List<PocketMonsterAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<PocketMonsterAbility> abilities) {
        this.abilities = abilities;
    }

    public List<PocketMonsterMove> getMoves() {
        return moves;
    }

    public void setMoves(List<PocketMonsterMove> moves) {
        this.moves = moves;
    }

    public PocketMonsterSprite getSprites() {
        return sprites;
    }

    public void setSprites(PocketMonsterSprite sprites) {
        this.sprites = sprites;
    }
}