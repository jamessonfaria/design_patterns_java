package br.com.jamesson.behavioral_patterns.state.pacman.game;

@FunctionalInterface
public interface GameEventListener {

    void onAction(String option);
}
