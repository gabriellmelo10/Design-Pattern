package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone IPhoneX = genXFactory.orderIPhone("standard");
		System.out.println(IPhoneX);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone IPhone11 = gen11Factory.orderIPhone("HighEnd");
		System.out.println(IPhone11);
	}
}
