package classes;

public class MeuSingleton {


    //TRES ELEMENTOS QUE COMPOEM O SINGLETON

    //instancia privada, para que nao possa ser alterada fora da classe
    private static MeuSingleton instance;

    //verificação da instancia
    public static MeuSingleton getInstance() {
        if (instance == null)
            instance = new MeuSingleton();
        return instance;
    }

    //criando um construtor private na classe pra ela não ser inicializada fora da classe
    private MeuSingleton(){

    }

}
