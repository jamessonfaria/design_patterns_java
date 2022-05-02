package br.com.jamesson.estructural_patterns.adapter.tv_port.devices;

import br.com.jamesson.estructural_patterns.adapter.tv_port.interfaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
