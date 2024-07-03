module online.yardstrong.toolkit.desktopterminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens online.yardstrong.terminal to javafx.fxml;
    exports online.yardstrong.terminal;
    exports online.yardstrong.learn;
    exports online.yardstrong.terminal.controller;
    opens online.yardstrong.terminal.controller to javafx.fxml;
}