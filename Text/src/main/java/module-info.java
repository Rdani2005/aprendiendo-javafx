module com.rdani2005.text {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rdani2005.text to javafx.fxml;
    exports com.rdani2005.text;
}