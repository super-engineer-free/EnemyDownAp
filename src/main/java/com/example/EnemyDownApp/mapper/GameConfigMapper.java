package com.example.EnemyDownApp.mapper;

import com.example.EnemyDownApp.mapper.data.GameConfig;
import com.example.EnemyDownApp.mapper.data.PlayerScore;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GameConfigMapper {

  @Select("select * from game_config")
  List<GameConfig> selectConfigList();

  @Select("select * from game_config where difficulty = #{difficulty}")
  GameConfig selectConfig(String difficulty);
}
