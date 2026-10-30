module com.cortez.herramientas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.cortez.herramientas to javafx.fxml;
    exports com.cortez.herramientas;
    opens com.cortez.herramientas.control to javafx.fxml;
}