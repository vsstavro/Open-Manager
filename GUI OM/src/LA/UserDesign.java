package LA;

import java.util.HashMap;
import java.util.List;

import LA.GameMenu.SceneView;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class UserDesign extends Parent{
	
	public UserDesign(HashMap<String, SceneView >  next) {
		
		VBox m = new VBox(10);
		VBox u1 = new VBox(10);
		VBox rd = new VBox(400);
		
	
		m.setTranslateX(100);
			m.setTranslateY(200);
			u1.setTranslateX(100);
			u1.setTranslateY(200);
			rd.setTranslateX(500);
			rd.setTranslateY(50);
			
			
			final int offset = 400;
			u1.setTranslateX(offset);
			
			//Buttons
		MenuButton Stadium = new MenuButton("Stadium");
		MenuButton Team = new MenuButton("Team");
		MenuButton Train = new MenuButton("Train");
		MenuButton Save= new MenuButton("Save");
		MenuButton Menu= new MenuButton("Menu");
		MenuButton btnExit = new MenuButton ("Exit");
		MenuButton Nextweak= new MenuButton("Next week");
		MenuButtonUncliked Coins = new MenuButtonUncliked ("Coins");
		
		//The first instance of the menu
		rd.getChildren().addAll(Coins,Nextweak);
		m.getChildren().addAll(Team,Train,Stadium,Save,btnExit);
		
		
		Rectangle bg1 = new Rectangle(800,600);
		bg1.setFill(Color.GREY);
		bg1.setOpacity(0.4);
		 
		getChildren().addAll(bg1,rd,m);
		
		//Events which are executed when buttons are clicked
		Team.setOnMouseClicked(event->{
			System.out.println("aaaaaa");
		});
		
		Train.setOnMouseClicked(event->{
			System.out.println("aaaaaa");
		});
	
		Stadium.setOnMouseClicked(event->{
			System.out.println("aaaaaa");
		});
		
		Nextweak.setOnMouseClicked(event->{
			System.out.println("aaaaaa");
			});
			
			Save.setOnMouseClicked(event->{
				callNext(next.get("team"));
			});
			
			Menu.setOnMouseClicked(event->{
				
			});
				
			btnExit.setOnMouseClicked(event->{
				
				callNext(next.get("root"));
			});

	}
	protected void callNext(SceneView spesific) {
		
	       getScene().setRoot(spesific);
	}
		
}


