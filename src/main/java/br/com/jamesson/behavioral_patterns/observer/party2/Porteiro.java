package br.com.jamesson.behavioral_patterns.observer.party2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int valor = scanner.nextInt();

            if(valor == 1){
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
                observers.forEach(e -> e.chegou(event));
            }else{
                System.out.println("Alarme falso !");
            }
        }
    }
}
