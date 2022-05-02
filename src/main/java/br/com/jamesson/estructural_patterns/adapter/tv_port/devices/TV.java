package br.com.jamesson.estructural_patterns.adapter.tv_port.devices;

import br.com.jamesson.estructural_patterns.adapter.tv_port.interfaces.HDMI;

public class TV implements HDMI {
	
	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(">>> This is your sound: " + sound);
	}

}
