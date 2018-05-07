import java.applet.Applet;
import java.awt.*;

/**
 * 简单测试applet
 *
 * @author DonnieGao
 * @version Id: SimpleApplet.java, v 0.1 2018/5/7 下午6:17 DonnieGao Exp $$
 */
public class SimpleApplet extends Applet {
    @Override
    public void paint(Graphics graphics) {
        graphics.drawString("java makes applet eazy", 20, 20);
    }

}
