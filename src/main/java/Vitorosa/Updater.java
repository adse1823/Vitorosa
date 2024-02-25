package Vitorosa;

// import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Updater implements EventHandler<ActionEvent> {
    private int i = 0;
    private final Label headName;
    private final Label firstName;
    private final Label secondName;
    private final TextField entry;
    private WheatField wheatField;

    @Override
    public void handle(ActionEvent event){

        double split = Double.valueOf(entry.getText());
        String produce  = "Monthly produce: " + String.valueOf(wheatField.getWheatProduce(split));
        String totalProduce  = "Total produce: " +  String.valueOf(wheatField.getTotalProduce());
        firstName.setText(produce);
        secondName.setText(totalProduce);
        i += 1;
        String text = "Month:\t" + Integer.toString(i);
        headName.setText(text);
    }

    public Updater(Label firstName,Label secondName, TextField entry, Label helloText){
        this.headName = helloText;
        this.firstName = firstName;
        this.secondName = secondName;
        this.entry = entry;
        this.wheatField = new WheatField();
    }



    
}
