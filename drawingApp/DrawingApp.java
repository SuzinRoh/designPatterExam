package com.command;

import javax.swing.*;
/**
 * JAVA swing �� Ȱ���� command pattern ���� 
 * Ŀ�ǵ� ������ �̿��ؼ� ����� �� ����
 * @author sujin
 * @since 2021. 11. 03
 *
 */
public class DrawingApp extends JFrame {
	
	/* ����� �� */
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

























