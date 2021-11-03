package com.command;

import javax.swing.*;
/**
 * JAVA swing 을 활용한 command pattern 예제 
 * 커맨드 패턴을 이용해서 드로잉 앱 제작
 * @author sujin
 * @since 2021. 11. 03
 *
 */
public class DrawingApp extends JFrame {
	
	/* 드로잉 앱 */
	public DrawingApp(String title) {
		super(title);
		
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		
		JButton undoBtn = new JButton("undo");
		JButton clearBtn = new JButton("clear");
		
		DrawCanvas canvas = new DrawCanvas(400, 400);
		
		buttonBox.add(undoBtn);
		buttonBox.add(clearBtn);
		
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		
		getContentPane().add(mainBox);
		pack();
		setVisible(true);
	    
	}

	
	
	
}

























