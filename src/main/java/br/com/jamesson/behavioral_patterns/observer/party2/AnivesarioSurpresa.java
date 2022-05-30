package br.com.jamesson.behavioral_patterns.observer.party2;

import javax.sound.sampled.Port;

public class AnivesarioSurpresa {

    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();
        porteiro.addChegadaAniversarianteObserver(namorada);

        porteiro.start();

    }

}
