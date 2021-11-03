package com.command;

import java.awt.*;

/*
 * 캔버스설정
 * */
public class DrawCanvas extends Canvas implements Drawable {

	/* 캔버스 설정 */
	public DrawCanvas(int width, int height) {
		setSize(width, height);
		setBackground(Color.white);
	}
	
	/* 실제 드로잉 실행 */
	@Override
	public void draw(int x, int y) {
	
	}

}
