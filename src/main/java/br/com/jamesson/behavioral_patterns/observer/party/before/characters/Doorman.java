package br.com.jamesson.behavioral_patterns.observer.party.before.characters;

public class Doorman {
	private boolean status = false;

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean newStatus) {
		this.status = newStatus;
	}
}
