package br.com.jamesson.behavioral_patterns.command.alexa.after.lights;

public class LGLight implements GenericLight{

    @Override
    public void turnOn() {
        System.out.println("The LGLight is On");
    }

    @Override
    public void turnOff() {
        System.out.println("The LGLight is Off");
    }
    
}
