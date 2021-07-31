import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ProjetinhoDoGui extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Olarr!");
        Button btn = new Button();
        btn.setText("Diga pro Saugo te passar com esse projeto simples");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Me passe com esse projeto simples psor :p");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}