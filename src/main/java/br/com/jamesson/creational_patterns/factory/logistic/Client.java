package br.com.jamesson.creational_patterns.factory.logistic;

import br.com.jamesson.creational_patterns.factory.logistic.factory.LogisticsFactory;
import br.com.jamesson.creational_patterns.factory.logistic.factory.RoadLogistics;
import br.com.jamesson.creational_patterns.factory.logistic.factory.SeaLogistics;

public class Client {
    public static void main(String[] args) {

        LogisticsFactory road = new RoadLogistics();
        LogisticsFactory sea = new SeaLogistics();

        road.planDelivery();
        sea.planDelivery();

    }
}
