package LA;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MenuButtonUncliked extends StackPane {
	private Text text; 
	public MenuButtonUncliked(String name) {
		text = new Text(name);
		
		text.getFont();
		text.setFont(Font.font(20));
		text.setFill(Color.WHITE);
		
		Rectangle bg= new Rectangle (250,30);
		bg.setOpacity(0.6);
		bg.setFill(Color.BLACK);
		//bg.setEffect(new GaussianBlur(3.5));
		
		setAlignment(Pos.CENTER_LEFT);
		setRotate(-0.5);
		getChildren().addAll(bg,text);
	}
}
