module com.rdani2005.sliders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rdani2005.sliders to javafx.fxml;
    exports com.rdani2005.sliders;
}