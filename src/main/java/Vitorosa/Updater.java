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
    private final Label thirdName;
    private final Label fourthName;
    private final Label previousLabel;
    private final Label previousPollution;


    private final TextField entry;
    private WheatField wheatField;

    @Override
    public void handle(ActionEvent event){

        double split = Double.valueOf(entry.getText());
        String produce  = "Monthly produce: " + String.valueOf(wheatField.getWheatProduce(split));
        String totalProduce  = "Total produce: " +  String.valueOf(wheatField.getTotalProduce());
        String pollution = "Monthly pollution: " + String.valueOf(wheatField.getAirPollution(split/100));
        String totalPollution = "Total pollution: " + String.valueOf(wheatField.getTotalPollution());
        previousLabel.setText("Previous " + firstName.getText());
        firstName.setText(produce);
        secondName.setText(totalProduce);
        previousPollution.setText("Previously: " + thirdName.getText());
        thirdName.setText(pollution);
        fourthName.setText(totalPollution);
        String text = wheatField.getMonth();
        headName.setText(text);
    }

    public Updater(Label prevName, Label firstName,Label secondName,Label prevPoll, Label thirdName, Label fourthName , TextField entry, Label helloText){
        this.headName = helloText;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.fourthName = fourthName;
        this.previousLabel = prevName;
        this.previousPollution = prevPoll;
        this.entry = entry;
        this.wheatField = new WheatField();
    }



    
}
