package com.example.AiGameSpace;
public class RobotDirection {
private String forward="W";
private String back="S";
private String right="D";
private String left="A";
public void setForward(String forward){
    this.forward=forward;
}
public void setBack(String back){
    this.back=back;
}
public void setRight(String right){
    this.right=right;
}
public void setLeft(String left){
    this.left=left;
}
public String getForward(){
    return forward;
}
public String getBack(){
    return back;
}
public String getRight(){
    return right;
}
public String getLeft(){
    return left;
}
public String getDirection(){
    return "Forward:"+forward+"\nBack:"+back
            +"\nRight:"+right+"\nLeft:"+left;
}
}
