package br.com.jamesson.creational_patterns.factory.apple.after;

import br.com.jamesson.creational_patterns.factory.apple.after.factory.IPhone11ProFactory;
import br.com.jamesson.creational_patterns.factory.apple.after.factory.IPhoneFactory;
import br.com.jamesson.creational_patterns.factory.apple.after.factory.IPhoneXFactory;
import br.com.jamesson.creational_patterns.factory.apple.after.model.IPhone;

public class Client {
    
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone =  iphoneXFactory.orderIPhone(); //client.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 =  iphone11ProFactory.orderIPhone(); //client.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}

}
