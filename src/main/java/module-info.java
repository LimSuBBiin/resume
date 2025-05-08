module org.example.resume_0508 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.resume_0508 to javafx.fxml;
    exports org.example.resume_0508;
}