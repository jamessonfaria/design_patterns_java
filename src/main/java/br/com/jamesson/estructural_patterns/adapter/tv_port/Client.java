package br.com.jamesson.estructural_patterns.adapter.tv_port;

import br.com.jamesson.estructural_patterns.adapter.tv_port.adapters.HDMIToOldMonitorAdapter;
import br.com.jamesson.estructural_patterns.adapter.tv_port.adapters.HDMIToVGAAdapter;
import br.com.jamesson.estructural_patterns.adapter.tv_port.devices.Computer;
import br.com.jamesson.estructural_patterns.adapter.tv_port.devices.OldMonitor;
import br.com.jamesson.estructural_patterns.adapter.tv_port.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		
		Computer pc2 = new Computer();
		OldMonitor monitor = new OldMonitor();
		//pc2.connectPort(monitor);  //Don't work! That's the reason why we create the adapter
		pc2.connectPort(new HDMIToVGAAdapter(monitor));
		pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ Monitor Class Adapter ----------");
		
		Computer pc3 = new Computer();
		HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();
		pc3.connectPort(monitorAdaptee);
		pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
	}
}
