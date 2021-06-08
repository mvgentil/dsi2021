package br.univille.mvgentildsi2021.model;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
  
  private int score;

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
  

}
