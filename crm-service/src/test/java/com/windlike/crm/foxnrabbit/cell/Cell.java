package com.windlike.crm.foxnrabbit.cell;

import java.awt.Graphics;

/**
 * Cell成为接口，Fox和Rabbit实现这个接口
 * @author windlike
 *
 */
public interface Cell {

    public void draw(Graphics g, int x, int y, int size);
}
