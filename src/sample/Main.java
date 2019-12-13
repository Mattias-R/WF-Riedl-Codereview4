package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.FileInputStream;


public class Main extends Application {
 Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("CodeReview");

        window = primaryStage;

        /*
        Product vöslauer = new Product("Vöslauer","1.5Liter Flasche",0.75,0.49, "Resources\\voslauer__600x600.jpg","just water. nothing special");
        Product pfeffer = new Product("Pfeffer","300 gramm",3.49,2.79, "..\\Resources\\pfeffer__600x600.jpg","just pepper. nothing special");
        Product zucker = new Product("Zucker","400 gramm",3.49,2.79, "..\\Resources\\zucker__600x600.jpg","just sugar. nothing special");
        Product cheese = new Product("Käse","500 gramm",3.49,2.79, "..\\Resources\\cheese_salakis__600x600.jpg","just water. nothing special");

*/

        ObservableList<Product> items = FXCollections.observableArrayList(
                new Product("Vöslauer","1.5Liter Flasche","0.75","0.49", "voslauer__600x600.jpg","just water. nothing special"),
                new Product("Pfeffer","300 gramm","3.49","2.79", "pfeffer__600x600.jpg","just pepper. nothing special"),
                new Product("Zucker","400 gramm","3.49","2.79", "zucker__600x600.jpg","just sugar. nothing special"),
                new Product("Käse","500 gramm","3.49","2.79", "cheese_salakis__600x600.jpg","just water. nothing special")

        );

        //Textfields
        TextField prodName = new TextField();
        TextField quanti = new TextField();
        TextField old = new TextField();
        TextField neu = new TextField();

        //Labels
        Label name = new Label("Prod. Name: ");
        Label quantity = new Label("Quantity: ");
        Label oldPrice = new Label("Old Price: ");
        Label newPrice = new Label("New Price: ");
        Label desciption = new Label("Description: ");
        Label descText = new Label();

        // list
        ListView<Product> list = new ListView<>();
        list.getItems().addAll(items);


        //Grid
        GridPane gridPane = new GridPane();
        gridPane.add(name,0,0,2,1);
        gridPane.add(quantity,0,1,2,1);
        gridPane.add(oldPrice,0,2,2,1);
        gridPane.add(newPrice,0,3,2,1);
        gridPane.add(desciption,0,8,2,1);
        gridPane.add(descText,0,9,2,4);
        gridPane.setPadding(new Insets(35, 35, 35, 35));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
      //  gridPane.setGridLinesVisible(true);
        gridPane.add(prodName,3,0,2,1);
        gridPane.add(quanti, 3,1,2,1);
        gridPane.add(old,3,2,2,1);
        gridPane.add(neu,3,3,2,1);
        gridPane.add(list,7,0,8,8);
        //Boxes
        HBox main = new HBox(gridPane);

        Scene scene = new Scene(main,700,600);
        window.setScene(scene);
        primaryStage.show();

        list.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            prodName.setText(newValue.getName());
            quanti.setText(newValue.getQuantity());
            old.setText(newValue.getOld());
            neu.setText(newValue.getNeu());
            descText.setText(newValue.getDesc());
            javafx.scene.image.Image image = new Image(newValue.getImg());
            ImageView imageview = new ImageView(image);
            imageview.setFitHeight(250);
            imageview.setFitWidth(250);
            gridPane.add(imageview,1,5,3,3);

        });





    }


    public static void main(String[] args) {
        launch(args);
    }
}
