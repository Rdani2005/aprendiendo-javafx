module com.rdani2005.spinner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rdani2005.spinner to javafx.fxml;
    exports com.rdani2005.spinner;
}