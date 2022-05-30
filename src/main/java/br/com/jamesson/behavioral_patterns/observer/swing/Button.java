package br.com.jamesson.behavioral_patterns.observer.swing;

import javax.swing.JButton;

public class Button extends JButton {
    private static final long serialVersionUID = -6974338600947333550L;

    public Button(String text, Label... labels) {
        super(text);

        addActionListener(e -> {
            for (Label label : labels) {
                label.increment();
            }
        });
    }
}
