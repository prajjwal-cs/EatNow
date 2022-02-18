module io.dbc.github.eatnow {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.eatnow to javafx.fxml;
    exports io.dbc.github.eatnow;
}