import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;




    public class PNGWidget extends Pane {
        public PNGWidget() {
            Image image = new Image("http://www.iconarchive.com/icons/visualpharm/hardware/256/web-camera-icon.png");
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(150.0D);
            imageView.setFitWidth(150.0D);
            this.setBorder(new Border(new BorderStroke[]{new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)}));
            //VBox vbox = new VBox();
            //vbox.getChildren().addAll(new Node[]{imageView});
            this.getChildren().add(imageView);
        }
    }

