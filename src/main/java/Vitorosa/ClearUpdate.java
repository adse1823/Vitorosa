package Vitorosa;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ClearUpdate implements EventHandler<ActionEvent>{
    private final Label headName;
    private final Label firstLabel;
    private final Label secondLabel;
    private final Label thirdLabel;
    private final Label fourthLabel;
    private final Label fifthLabel;
    private final Label sixthLabel;

    
    private final TextField entry;


    @Override
    public void handle(ActionEvent event) {
        headName.setText("Start Again");
        firstLabel.setText("Previous month: ");
        secondLabel.setText("Monthly produce");
        thirdLabel.setText("Total produce: ");
        fourthLabel.setText("Pollution: ");
        sixthLabel.setText("Previous Pollution: ");
        fifthLabel.setText("Total pollution: ");
        entry.setText("Enter New value: ");    
    }
    
    public ClearUpdate(Label firstName,Label secondName,Label ThirdName,Label fourthName,Label fifthName,Label sixthLabel, TextField entry, Label helloText){
        this.headName = helloText;
        this.firstLabel = firstName;
        this.secondLabel = secondName;
        this.thirdLabel = ThirdName;
        this.fourthLabel = fourthName;
        this.fifthLabel = fifthName;
        this.sixthLabel = sixthLabel;
        this.entry = entry;
    }
}
