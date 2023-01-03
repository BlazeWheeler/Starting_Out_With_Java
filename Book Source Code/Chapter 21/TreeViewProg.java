import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

/**
 * This program demonstrates use of 
 * the TreeView component 
 */

public class TreeViewProg extends Application
{    
    @Override
    public void start(Stage primaryStage)
    {
        // Create root node
        TreeItem<String> root = new TreeItem<>("Al");
        root.setExpanded(true);
        
        // Create three nodes to be children of the root
        TreeItem<String> bob =  new TreeItem<>("Bob");
        TreeItem<String> kate =  new TreeItem<>("Kate");
        TreeItem<String> sidney =  new TreeItem<>("Sidney");
        root.getChildren().addAll(bob, kate, sidney);
        
        // Create Bob's children
        TreeItem<String> amy =  new TreeItem<>("Amy");
        TreeItem<String> chuck =  new TreeItem<>("Chuck");
        bob.getChildren().addAll(amy, chuck);
        
        // Create Sidney's child
        TreeItem<String> joey =  new TreeItem<>("Joey");
        sidney.getChildren().add(joey);                       
                     
        TreeView<String> treeView = new TreeView<>(root);       
        
        Scene scene = new Scene(treeView, 300, 250);        
        primaryStage.setTitle("Tree Exhibition Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }    
}
