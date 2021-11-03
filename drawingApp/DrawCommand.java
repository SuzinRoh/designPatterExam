package com.command;

import java.awt.*;

/*
 * µå·ÎÀ× ¼³Á¤
 * */
public class DrawCommand implements Command {
	private Drawable drawable;
	private Point point;
	
	public DrawCommand(Drawable drawable, Point point) {
		this.drawable = drawable;
		this.point = point;
	}
	
	@Override
	public void excute() {
		drawable.draw(point.x, point.y);
	}
  
}
