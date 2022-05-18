module com.rpg.rpg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rpg.rpg to javafx.fxml;
    exports com.rpg.rpg;
}