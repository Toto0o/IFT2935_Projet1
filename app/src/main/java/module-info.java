module app {
    requires javafx.controls;
    requires java.sql;

    exports kijijiApp;
    exports controllers;
    exports scenes;
    exports entities;
    exports status;
    exports db;
    exports entities.products;
    exports entities.offers;
    exports entities.estimates;
    exports entities.users;

    opens kijijiApp;
}