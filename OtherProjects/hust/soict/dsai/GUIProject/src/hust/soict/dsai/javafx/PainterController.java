package hust.soict.dsai.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.awt.event.*;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class PainterController {
	
	@FXML
	private RadioButton Pen;
	
	@FXML
	private RadioButton Eraser;
	
	@FXML
	private Pane drawingAreaPane;
	
	@FXML
	void clearButtonPressed(ActionEvent event) {
		//implement clearing of canvas 
		drawingAreaPane.getChildren().clear();
	}
	
	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {
		//implement drawing
		if (Pen.isSelected()) {
			Circle newCircle = new Circle(event.getX(),
					event.getY(), 4, Color.BLACK);
			drawingAreaPane.getChildren().add(newCircle);
		}else {
			Circle newCircle = new Circle(event.getX(),
					event.getY(), 4, Color.WHITE);
			drawingAreaPane.getChildren().add(newCircle);
		}
		
	}
}
