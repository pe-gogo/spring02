package com.model;

public class SimpleFactory {
    public static void main(String[] args) {
        Impl car = Factory.produce("car");
        car.fly();
    }
}

class Factory{
    public static Impl produce(String type){
        Impl impl = null;
        if(type.equals("car")){
            impl = new car();
            return impl;
        }
        return impl;
    }
}

class car implements Impl{

    public void fly() {
        System.out.println("car is fly!");
    }
}
