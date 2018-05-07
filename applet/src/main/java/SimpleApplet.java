/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */

import java.applet.Applet;
import java.awt.*;

/**
 * 简单测试applet
 *
 * @author gaoxinpeng
 * @version Id: SimpleApplet.java, v 0.1 2018/5/7 下午6:17 gaoxinpeng Exp $$
 */
public class SimpleApplet extends Applet {
    @Override
    public void paint(Graphics graphics) {
        graphics.drawString("java makes applet eazy", 20, 20);
    }

}
