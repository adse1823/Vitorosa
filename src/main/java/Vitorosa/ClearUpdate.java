package Vitorosa;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ClearUpdate implements EventHandler<ActionEvent>{
    private final Label headName;
    private final Label firstName;
    private final Label secondName;
    private final TextField entry;


    @Override
    public void handle(ActionEvent event) {
        headName.setText("Start Again");
        firstName.setText("First value");
        secondName.setText("Second Value");
        entry.setText("Enter New value");    
    }
    
    public ClearUpdate(Label firstName,Label secondName, TextField entry, Label helloText){
        this.headName = helloText;
        this.firstName = firstName;
        this.secondName = secondName;
        this.entry = entry;
    }
}
