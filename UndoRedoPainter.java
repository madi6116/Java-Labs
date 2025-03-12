package stacklab;

import java.util.*;


public class UndoRedoPainter extends Painter
{
	// Called when the user pushes the Undo button.
	public UndoRedoPainter() {
		this.setUndoButtonEnabled(false);
		this.setRedoButtonEnabled(false);
	}
	void undo()
	{
		
		getHistory();
		if(getHistory().isEmpty()) {
			setUndoButtonEnabled(false);
		} else { 
			setUndoButtonEnabled(true);
			getUndoHistory().push(getHistory().pop());
			setRedoButtonEnabled(true);
			repaint();
		}
	}


	// Called when the user pushes the Redo button
	void redo()
	{
		getUndoHistory();
			setRedoButtonEnabled(true);
			getHistory().push(getUndoHistory().pop());
			repaint();
	if(getUndoHistory().isEmpty()) {
		setRedoButtonEnabled(false);
	}
	}
	
	public static void main(String[] args)
	{
		new UndoRedoPainter().setVisible(true);
	}
}
