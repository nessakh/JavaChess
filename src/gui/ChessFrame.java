package gui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;

public class ChessFrame extends JFrame {

	private static final long serialVersionUID = 591882616190547773L;

	Action newGame, saveGame, loadGame, abandonGame, undo, redo;
	
	public ChessFrame() throws HeadlessException {}

	public ChessFrame(GraphicalBoard guiBoard) {
		setTitle("Chess Game");
		setSize(450, 450);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		guiBoard.setSize(guiBoard.getPreferredSize());
		guiBoard.paintComponent(getGraphics());
		
		JPanel constraint = guiBoard.getConstraintPanel();
		JPanel tools = new JPanel();
		JToolBar toolbar = new JToolBar();
		toolbar.setFloatable(false);
		add(toolbar, BorderLayout.PAGE_START);
		
		newGame 		= new AbstractAction("New Game"){
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		};
		
		saveGame 		= new AbstractAction("Save Game"){
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		};
		
		loadGame 		= new AbstractAction("Load Game"){
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		};
		
		abandonGame 		= new AbstractAction("Resign"){
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		};
		
		undo 		= new AbstractAction("Undo"){
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		};
		
		redo 		= new AbstractAction("Redo"){
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		};
				
		newGame 	    .setEnabled(true);
		saveGame 	    .setEnabled(false);
		loadGame 	    .setEnabled(true);
		abandonGame     .setEnabled(false);
		undo     		.setEnabled(false);
		redo 			.setEnabled(false);
		
		JButton newButton 	  = new JButton(newGame);
		JButton saveButton 	  = new JButton(saveGame);
		JButton loadButton 	  = new JButton(loadGame);
		JButton abandonButton = new JButton(abandonGame);
		JButton undoButton    = new JButton(undo);
		JButton redoButton    = new JButton(redo);
		
		toolbar.add(newButton);
		toolbar.add(saveButton);
		toolbar.add(loadButton);
		toolbar.addSeparator();
		toolbar.add(abandonButton);
		toolbar.addSeparator();
		toolbar.add(undoButton);
		toolbar.add(redoButton);
		tools.add(toolbar);
		add(tools, BorderLayout.NORTH);
		add(constraint, BorderLayout.CENTER);
		
		setMinimumSize(new Dimension(450, 450));
		
		JPanel statusBar = new JPanel();
		JTextPane tp = new JTextPane();
		tp.setText("Welcome to Chess");
		statusBar.setSize(new Dimension(getWidth(), 230));
		statusBar.add(tp);
		
		add(statusBar, BorderLayout.SOUTH);
		
		pack();
		
	}

}
