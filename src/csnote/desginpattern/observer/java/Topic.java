package csnote.desginpattern.observer.java;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject{
    private List<Observer> observers;
    private String msg;

    public Topic() {
        this.observers = new ArrayList<>();
        this.msg = "";
    }


    @Override
    public void register(Observer obj) {
        if(!observers.contains(obj))observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.msg;
    }

    public void postMessage(String msg){
        System.out.println("Message sended to Topic" + msg);
        this.msg = msg;
        notifyObservers();
    }
}
