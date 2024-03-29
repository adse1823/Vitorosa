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

    public Label makelabel(String s){
        Label label = new Label (s);
        label.setFont (new Font ("Comic Sans MS", 16));
        label.setTextFill (Color.RED);
        label.setPadding (new Insets (20));
        label.setAlignment (Pos.CENTER);
        label.setMaxWidth(Double.POSITIVE_INFINITY);

        return label;
    }
  
    @Override
    public void start(Stage stage) throws Exception {
        Label hello = new Label ("Year Start");
        hello.setFont (new Font ("Impact", 60));
        hello.setTextFill (Color.BLUE);
        hello.setAlignment (Pos.CENTER);
        // hello.setMaxWidth (Double.POSITIVE_INFINITY);

        Label previousProduce = makelabel("Previous produce");
        Label Produce= makelabel("Produce");
        Label totalProduce = makelabel("Total Produce");
        Label Pollution = makelabel("Pollution");
        Label previousPollution = makelabel("Previous pollution");
        Label totalPollution = makelabel("Total Pollution");

        HBox produces = new HBox();
        produces.getChildren().addAll(Produce,previousProduce);
        produces.setMaxWidth(Double.POSITIVE_INFINITY);
        produces.setBorder (new Border (new BorderStroke (
            Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii (20), BorderStroke.THICK
        )));

        HBox pollutions = new HBox();
        pollutions.getChildren().addAll(Pollution,previousPollution);
        pollutions.setMaxWidth(Double.POSITIVE_INFINITY);
        pollutions.setBorder (new Border (new BorderStroke (
            Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii (20), BorderStroke.THICK
        )));

        VBox top = new VBox ();
        top.getChildren ().addAll (hello,produces,totalProduce,pollutions,totalPollution);
        top.setBorder (new Border (new BorderStroke (
            Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii (20), BorderStroke.THICK
        )));

        Label entryLabel = makelabel("Enter Percentage of coal used (0 - 100)");
        entryLabel.setAlignment(Pos.TOP_CENTER);
        entryLabel.setMaxHeight(40);
        entryLabel.setFont(new Font("Times New Roman",14));

        TextField entry = new TextField ("");
        entry.setMaxHeight(40);
        entry.setMaxWidth(Double.POSITIVE_INFINITY);
        entry.setAlignment (Pos.CENTER);



        WheatField wheatField = new WheatField();
        Button update = new Button ("Update values");
        update.setMaxWidth (Double.POSITIVE_INFINITY);
        update.setMaxHeight(40);
        update.setOnAction (new Updater (wheatField,previousProduce,Produce,totalProduce,previousPollution,Pollution,totalPollution, entry,hello));

        HBox entrySet = new HBox();
        entrySet.getChildren().addAll(entryLabel,entry,update);        
        
        
        Button clear = new Button ("Clear");
        clear.setMaxWidth (Double.POSITIVE_INFINITY);
        clear.setMaxHeight(Double.POSITIVE_INFINITY);
        clear.setOnAction(new ClearUpdate(wheatField, previousProduce,Produce,totalProduce,Pollution,previousPollution,totalPollution, entry, hello));

        Label info = new Label(Info.text);     
        info.setFont (new Font ("Impact", 20));       
        
        VBox box = new VBox ();
        box.getChildren().addAll (top, entrySet, clear,info);
        
        Scene scene = new Scene (box);
        stage.setScene (scene);
        stage.show ();
    }

    public static void main(String[] args) {
        launch (args);
    }
    




    }

