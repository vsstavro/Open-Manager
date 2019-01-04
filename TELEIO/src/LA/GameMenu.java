package LA;




import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import LA.GameMenu.SceneView;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;



public class GameMenu extends Application {
	
	private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
	
	
    public abstract class SceneView extends Pane { 
    	/*private SceneView next;
    	SceneView(SceneView next) {
           this.next = next;
        }

        protected void callNext() {
         
                	getScene().setRoot(next);
     
        }*/
        List<SceneView> next1 = new ArrayList<>();
        SceneView(List<SceneView>  next1) {
            this.next1 = next1;
        }      
        protected void callNext(SceneView name) {
        	        	getScene().setRoot(name);
        }
		public void createGUI(List<SceneView> center) {
			
		}
    }
 /////////////////////////////////////////////////////////////////////////   
    private class UserView extends SceneView  { 
    		
      	public UserView(List<SceneView>  next) {
      		super(next);
           Image image1 = new Image("general.jpeg");
           ImageView img1 = new ImageView( image1);
           img1.setFitWidth(WIDTH);
   			img1.setFitHeight(HEIGHT);
   			getChildren().add(img1);
      	}
      	@Override
    	public void createGUI(List<SceneView> next){
    		
    		getChildren().add(new MainMenu(next));
    	}

		public class MainMenu extends Parent{
			public MainMenu(List<SceneView> next) {
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
	 				callNext(next.get(1));
	 			});
	 			
	 			Menu.setOnMouseClicked(event->{
	 				
	 			});
	 				
	 			btnExit.setOnMouseClicked(event->{
	 				
	 				callNext(next.get(0));
	 			});

			}
	
				
		}
		
    }

 //////////////////////////////////////////////   

    private class ViewMenu extends SceneView  {
    	
    	public ViewMenu(List<SceneView>  next) {
	           super(next);      
	           Image image = new Image("ok.jpeg");
	           ImageView img = new ImageView( image);
	           img.setFitWidth(WIDTH);
	   			img.setFitHeight(HEIGHT);
	           getChildren().add(img);
	           
	        };
	        
	    public void createGUI(List<SceneView> next){
	    		
	    	getChildren().add(new EnteringMenu(next));
	    }
    	
    	public class EnteringMenu extends Parent{
    		public EnteringMenu(List<SceneView> next) {
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
    				callNext(next.get(0));
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
    	}	        
    }
/////////////////////////////////////////////////////////////////
    	private class TeamView extends SceneView  { 
    	
    		public TeamView(List<SceneView>  next) {
    			super(next);
    		}
    	}
//////////////////////////////////////////////////////////////////
    @Override
    public void start(Stage primaryStage) {

    	//List<SceneView > center= new ArrayList<>();
    	SceneView  root = new ViewMenu(null);
    	SceneView  user = new UserView(null);
    	SceneView  team= new TeamView(null);
    	//
    	//
    	//
        root.createGUI(Stream.of(user).collect(Collectors.toList()));
        user.createGUI(Stream.of(root, team).collect(Collectors.toList()));
        
       
        		
        Scene scene = new Scene(root, WIDTH,HEIGHT );

        primaryStage.setTitle("Open Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
	
	
