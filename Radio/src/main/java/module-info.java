module com.rdani2005.radio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rdani2005.radio to javafx.fxml;
    exports com.rdani2005.radio;
}