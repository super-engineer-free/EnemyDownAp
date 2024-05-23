package com.example.EnemyDownApp.controller;

import com.example.EnemyDownApp.mapper.data.GameConfig;
import com.example.EnemyDownApp.service.ConfigService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

  @Autowired
  private ConfigService service;

  public ConfigController(ConfigService service) {
    this.service = service;
  }

  @RequestMapping(value = "/configList", method = RequestMethod.GET)
  public List<GameConfig> configList() {
    return service.searchConfig();
  }

  @RequestMapping(value = "/configList", method = RequestMethod.GET)
  public GameConfig config(@RequestParam String difficulty) {
    return service.searchConfig(difficulty);
  }
}