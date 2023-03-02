module com.example.cervezas1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cervezas1 to javafx.fxml;
    exports com.example.cervezas1;
}