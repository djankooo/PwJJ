import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ButtonsWidget extends Pane {
    public ButtonsWidget() {
        this.setPrefSize(200.0D, 200.0D);
        this.setBorder(new Border(new BorderStroke[]{new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)}));
        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Node[]{new Button("Start"), new Button("Stop"), new Label("Buttons wigdet")});
        this.getChildren().add(vbox);
    }
}