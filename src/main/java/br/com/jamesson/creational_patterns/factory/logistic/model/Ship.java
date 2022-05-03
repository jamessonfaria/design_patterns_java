package br.com.jamesson.creational_patterns.factory.logistic.model;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entrega realizada via Ship");         
    }
    
}
