package classes;

import interfaces.Prototype;

public class PrototypeConcreto2 extends Prototype{

    @Override
    public Prototype clone() {
        System.out.println("Clonou " + PrototypeConcreto2.class);
        return new PrototypeConcreto2();
    }
    

}
