package com.model;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton(){};

    public Singleton getSingleton(){
        if(singleton==null){
            synchronized(Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
class SingletonStatic{
    private static class SingletonHoder{
        private static SingletonStatic singleton= new SingletonStatic();
        }

        private SingletonStatic (){};

        public SingletonStatic getInstance(){
            return SingletonHoder.singleton;
        }
}
