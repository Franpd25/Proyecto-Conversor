module com.franprados.ProyectoConversor {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;

    opens com.franprados.ProyectoConversor to javafx.fxml;
    exports com.franprados.ProyectoConversor;
}
