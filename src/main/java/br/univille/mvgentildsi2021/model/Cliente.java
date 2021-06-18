package br.univille.mvgentildsi2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Cliente extends Pessoa {
  
  @Column(columnDefinition = "integer default 0")
  private int score;

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
  

}
