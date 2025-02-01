package co.jht.controller;

import co.jht.model.mon.response.PocketMonster;
import co.jht.service.impl.PocketMonsterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/pokemon")
public class MainController {

    private final PocketMonsterInfoService pocketMonsterInfoService;

    @Autowired
    public MainController(PocketMonsterInfoService pocketMonsterInfoService) {
        this.pocketMonsterInfoService = pocketMonsterInfoService;
    }

    @GetMapping("/{id}")
    public PocketMonster getPocketMonster(
            @PathVariable Long id
    ) throws IOException, InterruptedException {
        return pocketMonsterInfoService.getPocketMonsterInfo(id);
    }
}