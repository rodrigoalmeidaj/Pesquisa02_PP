package classes;

import classesAbstratas.ScrollBar;
import classesAbstratas.WidgetFactory;
import classesAbstratas.Window;

public class PMWidgetFactory extends WidgetFactory{

    @Override
    public ScrollBar createScrollBar() {
    
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {

        return new PMWindow();
    }
    
}
