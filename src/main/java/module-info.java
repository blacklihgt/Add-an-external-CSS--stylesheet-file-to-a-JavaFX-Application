module com.login.javafxstyle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.login.javafxstyle to javafx.fxml;
    exports com.login.javafxstyle;
}