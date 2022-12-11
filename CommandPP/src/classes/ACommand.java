package classes;

import interfaces.Command;

public class ACommand implements Command{

    @Override
    public void execute() {
        System.out.println("Comando A executado");
        
    }
    
}
