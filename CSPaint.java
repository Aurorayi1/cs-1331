//I worked on the homework assignment alone, using only course materials.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.control.ToggleGroup;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.TextField;
import javafx.scene.shape.ArcType;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
/**
 * This class represents a CSPaint object
 * @author Wenye Yi
 * @version 1.0
 */
public class CSPaint extends Application {
    // create a border pane
    private BorderPane pane = new BorderPane();
        // place nodes in the pane
    private Canvas canvas = new Canvas(650, 450);
    private int count = 0;
    private Scene scene = new Scene(pane);
    private Label label = new Label("( , )      Number of Shape: 0");
    private RadioButton rdDraw = new RadioButton("Draw");
    private RadioButton rdErase = new RadioButton("Erase");
    private RadioButton rdCircle = new RadioButton("Circle");
    private TextField textField = new TextField();
    private ToggleGroup group = new ToggleGroup();
    private GraphicsContext gc = canvas.getGraphicsContext2D();
    private Button button = new Button("Clear Canvas");

    @Override
    /**
     * This start method takes in one parameter
     * @param primaryStage primary stage
     */
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(20);

        vBox.setPadding(new Insets(5, 5, 5, 5));
        vBox.getChildren().addAll(rdDraw, rdErase, rdCircle, textField, button);
        pane.setLeft(vBox);
        vBox.setStyle("-fx-background-color: lightgray;");
        pane.setCenter(canvas);
        pane.setBottom(label);
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 650, 450);

        canvas.setOnMouseMoved(event -> {
                double x = event.getX();
                double y = event.getY();
                label.setText("(" + x + ", " + y + ")      Number of shape: " + count);
            });

        canvas.setOnMouseClicked(event -> {
                if (rdDraw.isSelected()) {
                    String colorName = textField.getText();
                    try {
                        if (colorName.equals("")) {
                            colorName = "black";
                        }
                        Color newColor = Color.valueOf(colorName);
                        gc.setFill(newColor);
                    } catch (Exception e) {
                        Alert alert = new Alert(Alert.AlertType.ERROR,
                            "Invalid color entered!", ButtonType.OK);
                        alert.setTitle("Error Dialog");
                        alert.setHeaderText("Invalid Color");
                        alert.showAndWait();

                    }
                    gc.fillArc(event.getX(), event.getY(), 4, 4, 0, 360, ArcType.CHORD);
                } else if (rdCircle.isSelected()) {
                    String colorName = textField.getText();
                    try {
                        if (colorName.equals("")) {
                            colorName = "black";
                        }
                        Color newColor = Color.valueOf(colorName);
                        gc.setFill(newColor);
                        gc.fillArc(event.getX(), event.getY(), 30, 30, 0, 360, ArcType.CHORD);
                        count++;
                        double x = event.getX();
                        double y = event.getY();
                        label.setText("(" + x + ", " + y + ")      Number of shape: " + count);
                    } catch (Exception e) {
                        Alert alert = new Alert(Alert.AlertType.ERROR,
                            "Invalid color entered!", ButtonType.OK);
                        alert.setTitle("Error Dialog");
                        alert.setHeaderText("Invalid Color");
                        alert.showAndWait();

                    }
                }
                if (rdErase.isSelected()) {
                    gc.setFill(Color.WHITE);
                    gc.fillArc(event.getX(), event.getY(), 20, 20, 0, 360, ArcType.CHORD);
                }

            });
        canvas.setOnMouseDragged(event -> {
                if (rdDraw.isSelected()) {
                    gc.fillArc(event.getX(), event.getY(), 4, 4, 0, 360, ArcType.CHORD);
                }
                if (rdErase.isSelected()) {
                    gc.setFill(Color.WHITE);
                    gc.fillArc(event.getX(), event.getY(), 20, 20, 0, 360, ArcType.CHORD);
                }
            });

        button.setOnMouseClicked(event -> {
                gc.setFill(Color.WHITE);
                gc.fillRect(0, 0, 650, 450);
                double x = event.getX();
                double y = event.getY();
                count = 0;
                label.setText("(" + x + ", " + y + ")      Number of shape: " + count);
            });


        rdDraw.setToggleGroup(group);
        rdErase.setToggleGroup(group);
        rdCircle.setToggleGroup(group);

        primaryStage.setTitle("CSPaint");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * This main method takes in one parameter
     * @param args the argument
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}