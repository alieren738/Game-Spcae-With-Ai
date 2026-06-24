package com.example.AiGameSpace;
import java.util.Scanner;
public class RobotMove{
    String moveDirection;
    private int speed;
    int xAmount=500;
    int yAmount=500;
    RobotMove(int speed){
        this.speed=speed;
    }  
    Scanner scanner=new Scanner(System.in);
    RobotDirection direction=new RobotDirection();
    public void setSpeed(int speed){
        this.speed=speed;
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
}
