module ru.sectorsj.hortsmann_vol1 {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            requires eu.hansolo.tilesfx;
            requires eu.hansolo.fx.heatmap;
            requires com.almasb.fxgl.all;

    exports ru.sectorsj.hortsmann_v1._0_hello;
    opens ru.sectorsj.hortsmann_v1._0_hello to javafx.fxml;
}