package classesAbstratas;

//criando a Abstract Factory
public abstract class WidgetFactory {
    //criando os factory method
    public abstract ScrollBar createScrollBar();
    public abstract Window createWindow();

}
