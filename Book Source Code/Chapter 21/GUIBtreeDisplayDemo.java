 import javafx.application.Application;
 import javafx.geometry.Insets;
 import javafx.scene.Scene;
 import javafx.scene.layout.VBox;
 import javafx.stage.Stage;
 
 /**
    This program demonstrates the GUI display of a 
    binary tree.
 */
 
 public class GUIBtreeDisplayDemo extends Application
 {
     public static void main(String [] args)
     {
        launch();
     }
     
     @Override
     public void start(Stage stage) throws Exception
     {        
         // Create the tree.
         Node root;
         Node aNode = new Node(10);
         aNode.left = new Node(20);
         Node dNode = new Node(40);
         Node cNode = new Node(30, dNode, new Node(50));
         aNode.right = cNode;
         root = aNode;
         
         // Display the binary tree in a scene on the stage.
         VBox vBox = new VBox(GUINodeUtilities.getView(root));
         vBox.setPadding(new Insets(10));
         Scene scene = new Scene(vBox);
         stage.setScene(scene);
         stage.setTitle("Display of Binary Tree");
         stage.show();        
     }   
 }
