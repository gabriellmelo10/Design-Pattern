package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
    
    public static void main(String[] args) { 
        
        System.out.println("### Ordering an iPhone X");
        IPhone iphoneX = IPhoneSimpleFactory.orderIPhone("x", "standard");
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone11 = IPhoneSimpleFactory.orderIPhone("11", "highend");
        System.out.println(iphone11);
    }
}
