package LA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import LA.GameMenu.SceneView;
import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class MenuDesign extends Parent{
	
	public MenuDesign(HashMap<String, SceneView >  next) {
		
		VBox menu0 = new VBox(10);
		VBox menu1 = new VBox(10);
		
		
		menu0.setTranslateX(100);
		menu0.setTranslateY(200);
		menu1.setTranslateX(100);
		menu1.setTranslateY(200);
		
		final int offset = 400;
		menu1.setTranslateX(offset);
		
		//Buttons
		MenuButton btnExit = new MenuButton("Exit");
		MenuButton btnBack = new MenuButton("Back");
		MenuButton btnNewGame = new MenuButton("New game");
		MenuButton btnSelect = new MenuButton("Select team");
		MenuButton btnLoad = new MenuButton ("Load");
		
		//The first instance of the menu
		menu0.getChildren().addAll(btnNewGame,btnLoad,btnExit);
		
		
		Rectangle bg = new Rectangle(800,600);
		bg.setFill(Color.GREY);
		bg.setOpacity(0.2);
		 
		getChildren().addAll(bg,menu0);
		
		//Events which are executed when buttons are clicked
		btnLoad.setOnMouseClicked(event->{
			callNext(next.get("user"));
		});
		
		btnSelect.setOnMouseClicked(event->{
					
		});
		
		btnExit.setOnMouseClicked(event->{
				System.exit(0);	
		});
		 			
		btnBack.setOnMouseClicked(event->{
			getChildren().add(menu0);
			menu0.getChildren().addAll(btnNewGame,btnLoad,btnExit);
			menu1.getChildren().clear();
			
			TranslateTransition tt = new TranslateTransition(Duration.seconds(0.5),menu1);
			tt.setToX(menu1.getTranslateX()- offset);
			
			TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.25),menu0);
			tt1.setToX(menu1.getTranslateX());
			
			tt.play();
			tt1.play();
			tt.setOnFinished(evt ->{
				getChildren().remove(menu1);
				
			});
		});
			
		btnNewGame.setOnMouseClicked(event->{
			getChildren().add(menu1);
			menu1.getChildren().addAll(btnSelect,btnBack,btnExit);
			menu0.getChildren().clear();
			
			TranslateTransition tt = new TranslateTransition(Duration.seconds(0.25),menu0);
			tt.setToX(menu0.getTranslateX()- offset);
			
			TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5),menu1);
			tt1.setToX(menu0.getTranslateX());
			
			tt.play();
			tt1.play();
			tt.setOnFinished(evt ->{
				getChildren().remove(menu0);    			        

			});
		});
	}
	protected void callNext(SceneView spesific) {
	
	       getScene().setRoot(spesific);
	}
	    
    	
}
	
