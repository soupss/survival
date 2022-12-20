import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;



class Game {
    private final String TITLE = "Survival";
    private final int SCREEN_WIDTH = 800;
    private final int SCREEN_HEIGHT = 600;


    private Stage stage;
    private Group root;
    private Scene scene;
    private Canvas canvas;
    private GraphicsContext gc;


    public Game(Stage stage) {
        this.stage = stage;
        this.root = new Group();
        this.scene = new Scene(this.root);
        this.canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.gc = this.canvas.getGraphicsContext2D();

        this.stage.setTitle(TITLE);
        this.stage.setScene(this.scene);
        this.root.getChildren().add(this.canvas);
    }


    public void render() {
        this.stage.show();
    }
}
