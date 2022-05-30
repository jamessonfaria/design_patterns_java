package br.com.jamesson.behavioral_patterns.observer.party2;

public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Ele chegou..." + event.getHoraDaChegada());
        System.out.println("Apagar as luzes...");
        System.out.println("Fazer silecio...");
        System.out.println("Surpresa !!!");
    }

}
