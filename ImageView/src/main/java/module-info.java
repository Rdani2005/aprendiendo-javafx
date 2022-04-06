module com.rdani2005.hola {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rdani2005.hola to javafx.fxml;
    exports com.rdani2005.hola;
}