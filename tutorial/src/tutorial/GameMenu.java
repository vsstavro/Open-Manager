package tutorial;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Stage;

public class GameMenu extends Application {
	
	private  GameMenu2 game;
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		root.setPrefSize(800,600);
		
		
		
		InputStream is = Files.newInputStream(Paths.get("res/images/ok.jpeg"));
		javafx.scene.image.Image img = new javafx.scene.image.Image(is);
		is.close();
		
		ImageView imgView = new ImageView(img);
		imgView.setFitWidth(800);
		imgView.setFitHeight(600);
		
		game = new GameMenu2();
		root.getChildren().addAll(imgView,game);
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static class MenuButton extends StackPane {
		private Text text; 
		public MenuButton(String name) {
			text = new Text(name);
			
			text.getFont();
			text.setFont(Font.font(20));
			text.setFill(Color.WHITE);
			
			Rectangle bg= new Rectangle (250,30);
			bg.setOpacity(0.6);
			bg.setFill(Color.BLACK);
			bg.setEffect(new GaussianBlur(3.5));
			
			setAlignment(Pos.CENTER_LEFT);
			setRotate(-0.5);
			getChildren().addAll(bg,text);
			
			//mouse enter
			
			setOnMouseEntered(event->{
				bg.setTranslateX(10);
				text.setTranslateX(10);
				bg.setFill(Color.WHITE);
				text.setFill(Color.BLACK);
			});
			
			setOnMouseExited(event->{
				bg.setTranslateX(0);
				text.setTranslateX(0);
				bg.setFill(Color.BLACK);
				text.setFill(Color.WHITE);
			});
			
			DropShadow drop =new DropShadow(50,Color.WHITE);
			drop.setInput(new Glow());
			
			setOnMousePressed(event -> setEffect(drop));
			setOnMouseReleased(event -> setEffect(null));
			
		}
	}
		private class GameMenu2 extends Parent{
			public GameMenu2() {
				VBox menu0 = new VBox(10);
				VBox menu1 = new VBox(10);
				final int offset = 400;
				
				menu0.setTranslateX(100);
				menu0.setTranslateY(200);
				menu1.setTranslateX(100);
				menu1.setTranslateY(200);
				
				
				//buttons
				MenuButton btnOptions = new MenuButton("Load");
				btnOptions.setOnMouseClicked(event->{
							
						});
				
				MenuButton btnExit = new MenuButton("Exit");
				btnExit.setOnMouseClicked(event->{
						System.exit(0);	
				});
				
				MenuButton btnNewGame = new MenuButton("New game");
				btnExit.setOnMouseClicked(event->{
						
				});
				
				
				 menu0.getChildren().addAll(btnNewGame,btnOptions,btnExit);
				
				 Rectangle bg = new Rectangle(800,600);
				 bg.setFill(Color.GREY);
				 bg.setOpacity(0.4);
				 
				 getChildren().addAll(bg,menu0);
			}
		}
		
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
