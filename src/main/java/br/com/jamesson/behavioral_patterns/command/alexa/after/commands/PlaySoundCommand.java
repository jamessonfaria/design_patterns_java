package br.com.jamesson.behavioral_patterns.command.alexa.after.commands;

import br.com.jamesson.behavioral_patterns.command.alexa.after.Sound.GenericSound;

public class PlaySoundCommand implements Command{

    private GenericSound sound;

    public PlaySoundCommand(GenericSound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.play();
    }
    
}
