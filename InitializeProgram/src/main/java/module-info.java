module com.rdani2005.initializeprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rdani2005.initializeprogram to javafx.fxml;
    exports com.rdani2005.initializeprogram;
}