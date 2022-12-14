package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.IPhone;
import br.com.cod3r.factory.apple.simple.model.IPhone11;
import br.com.cod3r.factory.apple.simple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.simple.model.IPhoneX;
import br.com.cod3r.factory.apple.simple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(String generation, String level) {
        IPhone iphone = null;

        if("X".equalsIgnoreCase(generation)){
            if("standard".equalsIgnoreCase(level)){
                iphone = new IPhoneX();
            } else if("HighEnd".equalsIgnoreCase(level)){
                iphone = new IPhoneXSMax();
            }
        } else if("11".equalsIgnoreCase(generation)){
            if("standard".equalsIgnoreCase(level)){
                iphone = new IPhone11();
            } else if("HighEnd".equalsIgnoreCase(level)){
                iphone = new IPhone11Pro();
            }
        }

        if(iphone != null){
            iphone.getHardware();
            iphone.assemble();
            iphone.certificates();
            iphone.pack();
        }

        return iphone;
    }
    
}
