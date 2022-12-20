import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application {
    private Game game;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) {
        this.game = new Game(stage);
        this.game.render();
    }
}
