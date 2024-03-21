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

    exports ru.sectorsj._0_hello;
    opens ru.sectorsj._0_hello to javafx.fxml;
    //opens ru.sectorsj._260_objectAnalyzer;
    //opens java.util; // Открываем пакет java.util для доступа из нашего модуля

}