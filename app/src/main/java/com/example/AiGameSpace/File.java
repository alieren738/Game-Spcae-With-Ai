package com.example.AiGameSpace;
/*
geri yazdırırken hızı sıfır yap
*/
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class File {
    //new yazmak sıfırdan kullanılmamış robot üretir
    //direkt parametre olarak yazmaksa kullanılan robotu üretir
    public void FileWrter(RobotMove move,RobotDirection direction,Fix fix,RobotBattery battery){
        try(ObjectOutputStream data=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Robotical")))){
            data.writeUTF("Robot's location is first(x) and second(y) value"
                    + "and also Robot's speed is third value ");
            data.writeObject(move);
            data.writeObject(direction);
            data.writeObject(fix);
            data.writeObject(battery);
        }
        catch(Exception e){
           System.out.println(e.getMessage());
           e.printStackTrace();
        }    
    }
}
