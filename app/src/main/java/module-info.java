module app {
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;

    exports kijijiApp;
    exports controllers;
    exports scenes;
    exports entities;
    exports status;
    opens kijijiApp to javafx.fxml;
}