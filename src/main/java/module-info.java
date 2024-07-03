module online.yardstrong.toolkit.desktopterminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens online.yardstrong.toolkit.terminal to javafx.fxml;
    exports online.yardstrong.toolkit.terminal;
    exports online.yardstrong.toolkit.terminal.controller;
    opens online.yardstrong.toolkit.terminal.controller to javafx.fxml;
}