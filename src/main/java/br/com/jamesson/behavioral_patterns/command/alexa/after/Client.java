package br.com.jamesson.behavioral_patterns.command.alexa.after;

import br.com.jamesson.behavioral_patterns.command.alexa.after.Sound.GenericSound;
import br.com.jamesson.behavioral_patterns.command.alexa.after.Sound.JBL;
import br.com.jamesson.behavioral_patterns.command.alexa.after.alexa.Alexa;
import br.com.jamesson.behavioral_patterns.command.alexa.after.commands.PlaySoundCommand;
import br.com.jamesson.behavioral_patterns.command.alexa.after.commands.TurnLightOffCommand;
import br.com.jamesson.behavioral_patterns.command.alexa.after.commands.TurnLightOnCommand;
import br.com.jamesson.behavioral_patterns.command.alexa.after.lights.GenericLight;
import br.com.jamesson.behavioral_patterns.command.alexa.after.lights.LGLight;
import br.com.jamesson.behavioral_patterns.command.alexa.after.lights.PhillipsHueLight;
import br.com.jamesson.behavioral_patterns.command.alexa.after.lights.XiaomiLight;

public class Client {

	public static void configureAlexa(Alexa alexa) {
		GenericLight livingRoom = new PhillipsHueLight();
		GenericLight kitchen = new XiaomiLight();
		GenericLight hall = new LGLight();
		
		alexa.addIntegration("Turn on the Living room light", new TurnLightOnCommand(livingRoom), "on", "Living room", "light");
		alexa.addIntegration("Turn off the Living room light", new TurnLightOffCommand(livingRoom), "off", "Living room", "light");
		alexa.addIntegration("Turn on the Kitchen light", new TurnLightOnCommand(kitchen), "on", "Kitchen", "light");
		alexa.addIntegration("Turn off the Kitchen light", new TurnLightOffCommand(kitchen), "off", "Kitchen", "light");
	
		alexa.addIntegration("Turn on the hall", new TurnLightOnCommand(hall), "on", "hall", "light");
		
		GenericSound home = new JBL();
		alexa.addIntegration("Play on the home", new PlaySoundCommand(home), "play", "on");
	}
	
	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		configureAlexa(alexa);
		
		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");
		
		alexa.sendRequest("Please, could you Turn off the Living room light?");

		alexa.sendRequest("Turn on hall light");

		alexa.sendRequest("Please, play on sound");
	}
}
