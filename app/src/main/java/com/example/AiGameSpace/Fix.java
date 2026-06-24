package com.example.AiGameSpace;
import java.util.Scanner;
public class Fix {
private int oil=100;
private int damage=0;
private int softwareError=0;
String oilMark="Castrol";
    Scanner scanner=new Scanner(System.in);
    public String getCondition(){
        return  "Oil:"+oil+"\nDamage:"+damage+"\nSoftware Error:"+softwareError;
    }
    public void robotuYiprat() {
    while(oil > 0 && damage < 100 && softwareError < 100) {
        oil--;
        damage++;
        softwareError++;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    public void fillOil(){
        System.out.println("Which oil do you take?");
        String oilBrand=scanner.next();
        if(!oilMark.equals(oilBrand)){
            System.out.println("You can not put it on me.");
        }
        else{
           while(oil<100){
               oil++;
            try{
             Thread.sleep(100);   
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
         } 
        }
        
       }
    
    public void fixDamage(){
        if(damage!=0){
           while(damage>0){
               damage--;
             try{
             Thread.sleep(100);   
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
         }  
        }
        else{
            System.out.println("I have no damage.");
        } 
    }
    
    public void fixSoftware(){
        if(softwareError==0){
            System.out.println("I have no software Error");
        }
        else{
            while(softwareError>0){
                softwareError--;
            try{
              Thread.sleep(100);   
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
           }
        }
    }
}
