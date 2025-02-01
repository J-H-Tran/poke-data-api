package co.jht.repository;

import co.jht.entity.PocketMonster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PocketMonsterRepository extends JpaRepository<PocketMonster, Long> {
}