import classes.IDE;
import classes.MotifWidgetFactory;
import classes.PMWidgetFactory;

public class Client {
    public static void main(String[] args) throws Exception {
        
        IDE ide = new IDE(new MotifWidgetFactory());

        //AO MUDAR UM OBJETO, O ABSTRACT FACTORY FAZ COM QUE TODA FAMILIA SEJA MODIFCADA JUNTA.
        ide.setLayout(new PMWidgetFactory());
        
    }
}
