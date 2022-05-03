package br.com.jamesson.estructural_patterns.flyweight.map.model;

public class PixelType {

	private final char character;
	private final int treasureReward;

	public PixelType(char character, int treasureReward) {
		this.character = character;
		this.treasureReward = treasureReward;
	}

	public char getCharacter() {
		return character;
	}
	
	public int getTreasureReward() {
		return treasureReward;
	}
}
