package com.tddbyexample.money;

public class Dollar {
  public Integer amount;

  public Dollar(int amount){
    this.amount = amount;
  }

  public void times(int multiplier){
    amount = amount * 2;
  }
}
