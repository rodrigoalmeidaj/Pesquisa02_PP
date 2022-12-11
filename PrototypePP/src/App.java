import interfaces.Prototype;
import classes.PrototypeConcreto1;
import classes.PrototypeConcreto2;

public class App {
    public static void main(String[] args){

        PrototypeConcreto1 t1 = new PrototypeConcreto1();
        PrototypeConcreto2 t2 = new PrototypeConcreto2();

        teste(t1);
        teste(t2);
    }

    public static void teste(Prototype o) {
        
        Prototype p = o.clone();
        PrototypeConcreto2 p2 = null;
        PrototypeConcreto1 p1 = null;
        
        if(p instanceof PrototypeConcreto2) {
            p2 = (PrototypeConcreto2) p;
        }else if(p instanceof PrototypeConcreto1){
            p1 = (PrototypeConcreto1) p;
        }
    }
}
