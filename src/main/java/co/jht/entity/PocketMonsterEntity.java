package co.jht.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "pocket_monster_entity")
public class PocketMonsterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pokeId;
    private String name;
    private Long height;
//    private String types;
//    private String stats;
//    private String abilities;
//    private String moves;
//    private String sprites;

    @Version
    private Long version = 0L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPokeId() {
        return pokeId;
    }

    public void setPokeId(Long pokeId) {
        this.pokeId = pokeId;
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

//    public String getTypes() {
//        return types;
//    }
//
//    public void setTypes(String types) {
//        this.types = types;
//    }
//
//    public String getStats() {
//        return stats;
//    }
//
//    public void setStats(String stats) {
//        this.stats = stats;
//    }
//
//    public String getAbilities() {
//        return abilities;
//    }
//
//    public void setAbilities(String abilities) {
//        this.abilities = abilities;
//    }
//
//    public String getMoves() {
//        return moves;
//    }
//
//    public void setMoves(String moves) {
//        this.moves = moves;
//    }
//
//    public String getSprites() {
//        return sprites;
//    }
//
//    public void setSprites(String sprites) {
//        this.sprites = sprites;
//    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}