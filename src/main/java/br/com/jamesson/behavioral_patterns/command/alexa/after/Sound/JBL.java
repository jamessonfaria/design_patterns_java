package br.com.jamesson.behavioral_patterns.command.alexa.after.Sound;

public class JBL implements GenericSound {

    @Override
    public void play() {
        System.out.println("Play sound by JBL...");        
    }
    
}
