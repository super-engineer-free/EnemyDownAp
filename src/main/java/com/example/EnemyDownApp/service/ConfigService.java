package com.example.EnemyDownApp.service;

import com.example.EnemyDownApp.mapper.GameConfigMapper;
import com.example.EnemyDownApp.mapper.data.GameConfig;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {


  private final GameConfigMapper mapper;


  public ConfigService(GameConfigMapper mapper) {
    this.mapper = mapper;
  }

  public List<GameConfig> searchConfig() {
    return mapper.selectConfigList();
  }
  public GameConfig searchConfig(String difficulty) {
    return mapper.selectConfig(difficulty);
  }
}
