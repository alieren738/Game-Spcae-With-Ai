package com.example.AiGameSpace;
public class RobotBattery {
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
