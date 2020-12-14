package com.example.Navigation;

public class Vertex {
    private String name;//顶点名称
    private double x;//顶点横坐标
    private double y;//顶点纵坐标
    public Vertex(String name){
        this.name = name;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }
    public String getName(){
        return name;
    }

    public void input(double x,double y){
        //设置点的坐标
        this.x = x;
        this.y = y;
    }
}
