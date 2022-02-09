module io.dbc.github.eatnow {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.eatnow to javafx.fxml;
    exports io.dbc.github.eatnow;
}