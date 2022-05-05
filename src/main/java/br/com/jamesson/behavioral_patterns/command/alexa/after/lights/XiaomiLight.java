package br.com.jamesson.behavioral_patterns.command.alexa.after.lights;

public class XiaomiLight implements GenericLight {
	
	public void turnOn() {
		System.out.println("The XiaomiLight is On");
	}
	
	public void turnOff() {
		System.out.println("The XiaomiLight is Off");
	}
}
