package com.example.EnemyDownApp.mapper.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class PlayerScore {

  private int id;
  private  String playerName;
  private static int score;
  private  String difficulty;
  private LocalDateTime registered_at;
}
