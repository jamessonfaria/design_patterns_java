package br.com.jamesson.behavioral_patterns.state.headphone.after.states;

import br.com.jamesson.behavioral_patterns.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
