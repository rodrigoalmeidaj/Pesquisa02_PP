package classes;

import java.util.HashMap;
import java.util.Map;

import interfaces.Command;

public class Invoker {
    
    public static Map<String, Command> comandos = new HashMap<String, Command>();

    static{
        comandos.put("A", new ACommand());
        comandos.put("B", new BCommand());
    }

    public static void invoke(String commandString){
        comandos.get(commandString).execute();
    }


}
