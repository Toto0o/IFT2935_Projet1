module app {
    requires javafx.controls;
    requires java.sql;
    requires java.desktop;

    exports kijijiApp;
    exports controllers;
    exports scenes;
    exports entities;
    exports status;
    exports db;
    exports db.config;
    exports db.dto;
    exports entities.products;
    exports entities.offers;
    exports entities.estimates;
    exports entities.users;

    opens kijijiApp;
}