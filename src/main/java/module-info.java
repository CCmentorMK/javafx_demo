module com.cc.startfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cc.startfx to javafx.fxml;
    exports com.cc.startfx;
    exports com.cc.startfx.controller;
    opens com.cc.startfx.controller to javafx.fxml;
    exports com.cc.startfx.model;
    opens com.cc.startfx.model to javafx.fxml;
}