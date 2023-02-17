module com.nt.testktpm {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nt.testktpm to javafx.fxml;
    exports com.nt.testktpm;
}
