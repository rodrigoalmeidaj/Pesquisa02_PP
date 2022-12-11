package classes;

import interfaces.Command;

public class BCommand  implements Command{

    @Override
    public void execute() {
        System.out.println("Comando B executado");
        
    }
    
}
