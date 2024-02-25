module unit04 {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.media;

    opens Vitorosa to javafx.fxml;
    exports Vitorosa;
}
