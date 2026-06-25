package com.example.AiGameSpace;

import java.io.Serializable;
import java.util.Scanner;
/*
anlık hızı istersen transient yapmamalısın
*/
public class RobotMove implements Serializable{
    String moveDirection;
    private int speed=0;
    private transient int maxSpeed;
    private int xAmount=500;
    private int yAmount=500;
    RobotMove(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }  
    Scanner scanner=new Scanner(System.in);
    RobotDirection direction=new RobotDirection();
    public void IncreaseSpeed(){
        while(maxSpeed>speed){
           speed++; 
        }
    }
    public int getSpeed(){
        return speed;
    }
    public void RobotBaşlat(){
    while((xAmount<=1000 || xAmount>=0)&&(yAmount<=1000 || yAmount>=0)){
        if(scanner.next().equals(direction.getForward())){
        moveDirection="forward";
        xAmount+=speed;
        }
        else if (scanner.next().equals(direction.getBack())){
         moveDirection="back";
         xAmount-=speed;
        }
        else if(scanner.next().equals(direction.getRight())){
            moveDirection="right";
            yAmount+=speed;
        }
        else if(scanner.next().equals(direction.getLeft())){
            moveDirection="Left";
            yAmount-=speed;
        }
    }
  }
    public int getXAmount(){
        return xAmount;
    }
    public int getYAmount(){
        return yAmount;
    }
}
