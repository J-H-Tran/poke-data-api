package co.jht.service;

import co.jht.dto.PocketMonsterDTO;

import java.io.IOException;

public interface PocketMonsterInfoService {
    PocketMonsterDTO getPocketMonsterInfo(Long id) throws IOException, InterruptedException;
}