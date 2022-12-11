package classes;

import classesAbstratas.ScrollBar;
import classesAbstratas.WidgetFactory;
import classesAbstratas.Window;

public class MotifWidgetFactory extends WidgetFactory{

    @Override
    public ScrollBar createScrollBar() {
        
        return new MotifScrollBar();
    }

    @Override
    public Window createWindow() {
        
        return new MotifWindow();
    }
    
}
