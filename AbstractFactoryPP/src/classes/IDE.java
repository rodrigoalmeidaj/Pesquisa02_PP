package classes;

import classesAbstratas.ScrollBar;
import classesAbstratas.WidgetFactory;
import classesAbstratas.Window;

public class IDE {

    private ScrollBar sb;
    private Window w;

    public IDE(WidgetFactory wf) {
        setLayout(wf);
    }

    public void setLayout(WidgetFactory wf ) {
        w = wf.createWindow();
        sb = wf.createScrollBar();
        drawApp();
    }

    public void drawApp() {
        w.drawWindow();
        sb.drawScrollBar();
    }
    
}
