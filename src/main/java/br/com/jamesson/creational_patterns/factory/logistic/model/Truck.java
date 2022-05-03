package br.com.jamesson.creational_patterns.factory.logistic.model;

public class Truck implements Transport {

    @Override
    public void deliver() {
       System.out.println("Entrega realizada via Truck"); 
    }
    
}
