package LA;




import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
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
    	HashMap<String, SceneView > scenes = new HashMap<String, SceneView >();
        SceneView(HashMap<String, SceneView >   scenes) {
            this.scenes = scenes;
        }      
		abstract  void createGUI();
		protected void createIMG(String path) {
			 Image image = new Image(path);
	           ImageView img = new ImageView( image);
	           img.setFitWidth(WIDTH);
	   			img.setFitHeight(HEIGHT);
	           getChildren().add(img);
		}
    }
 /////////////////////////////////////////////////////////////////////////   
    private class UserView extends SceneView  { 
    		
      	public UserView(HashMap<String, SceneView >   next) {
      		super(next);
           createIMG("general.jpeg");
      	}
      	@Override
    	public void createGUI(){
    		
    		getChildren().add(new UserDesign(scenes));
    	}
    }

 //////////////////////////////////////////////   

    private class MenuView extends SceneView  {
    	
    	public MenuView(HashMap<String, SceneView > next) {
	           super(next);      
	           createIMG("ok.jpeg");   
	        };
	        
	    public void createGUI(){
	    	getChildren().add(new MenuDesign(scenes));
	    }        
    }
/////////////////////////////////////////////////////////////////
    	private class TeamView extends SceneView  {
    	   	public TeamView(HashMap<String, SceneView > next) {
 	           super(next);      
 	           createIMG("ok.jpeg"); 	           
 	        };
 	        
 	    public void createGUI(){
 	    		
 	    	//getChildren().add(new EnteringMenu(next));
 	    }
    	
    	}
/////////////////////////////////////////////////////////////////
    	private class StadiumView extends SceneView  {
    	   	public StadiumView(HashMap<String, SceneView > next) {
 	           super(next);      
 	           createIMG("ok.jpeg"); 	           
 	        };
 	        
 	    public void createGUI(){
 	    		
 	    	//getChildren().add(new EnteringMenu(next));
 	    }
    	
    	}    	
//////////////////////////////////////////////////////////////////
    @Override
    public void start(Stage primaryStage) {

    	//List<SceneView > center= new ArrayList<>();
    	SceneView  root = new MenuView(null);
    	SceneView  user = new UserView(null);
    	SceneView  team= new TeamView(null);
    	//
    	//
    	//
    	HashMap<String, SceneView > hmap = new HashMap<String, SceneView >();
    	hmap.put("root",root);
        hmap.put("user",user);
        hmap.put("team",team);
        
    	root.scenes=hmap;
    	user.scenes= hmap;
        root.createGUI();
        user.createGUI();
        
        
       
        		
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
	
	
