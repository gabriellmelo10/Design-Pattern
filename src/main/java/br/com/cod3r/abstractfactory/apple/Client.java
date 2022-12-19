package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		//CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = genXFactory.orderIPhone("standard");
		System.out.println(iPhone);

	}
}
