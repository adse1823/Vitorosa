package Vitorosa;

import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class RunTown extends Application {
  
    @Override
    public void start(Stage stage) throws Exception {
        Label hello = new Label ("Year Start");
        hello.setFont (new Font ("Impact", 20));
        hello.setTextFill (Color.BLUE);
        hello.setAlignment (Pos.CENTER);
        hello.setMaxWidth (Double.POSITIVE_INFINITY);

        Label yourName1 = new Label ("Your Name");
        yourName1.setFont (new Font ("Comic Sans MS", 16));
        yourName1.setTextFill (Color.RED);
        yourName1.setPadding (new Insets (20));
        yourName1.setAlignment (Pos.CENTER);

        Label yourName2 = new Label ("Your Name");
        yourName2.setFont (new Font ("Comic Sans MS", 16));
        yourName2.setTextFill (Color.RED);
        yourName2.setPadding (new Insets (20));
        yourName2.setAlignment (Pos.CENTER);

        VBox top = new VBox ();
        top.getChildren ().addAll (hello, yourName1,yourName2);
        top.setBorder (new Border (new BorderStroke (
            Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii (20), BorderStroke.THICK
        )));

        TextField entry = new TextField ("Enter percentage of coal used");
        entry.setMaxWidth(Double.POSITIVE_INFINITY);
        entry.setAlignment (Pos.CENTER);

        Button update = new Button ("Updage Name Tag");
        update.setMaxWidth (Double.POSITIVE_INFINITY);
        update.setOnAction (new Updater (yourName1,yourName2, entry,hello));

        HBox updateEntry = new HBox();
        updateEntry.getChildren().addAll(entry,update);
        updateEntry.setMaxWidth(Double.POSITIVE_INFINITY);
        updateEntry.setBorder (new Border (new BorderStroke (
            Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii (20), BorderStroke.THICK
        )));
        
        
        
        Button clear = new Button ("Clear");
        clear.setMaxWidth (Double.POSITIVE_INFINITY);
        clear.setMaxHeight(Double.POSITIVE_INFINITY);
        clear.setOnAction(new ClearUpdate(yourName1, yourName2, entry, hello));

        VBox box = new VBox ();
        box.getChildren().addAll (top, updateEntry, clear);
        
        Scene scene = new Scene (box);
        stage.setScene (scene);
        stage.show ();
    }

    public static void main(String[] args) {
        System.out.println(Double.toString(20.1));
        launch (args);
    }
    




    }

