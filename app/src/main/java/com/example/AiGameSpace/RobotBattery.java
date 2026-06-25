package com.example.AiGameSpace;

import java.io.Serializable;

public class RobotBattery implements Serializable {
private int battery=0;
public void Charge(){
    if(battery<=100){
        while(battery<=100){
            battery++;
        }
    }
    else{
        System.out.println("My charge is full");
    }
}
    public int getBattery(){
      return battery;
    }
}
