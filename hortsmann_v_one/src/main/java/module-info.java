import ru.sectorsj._329_serviceLoader.Cipher;
import ru.sectorsj._329_serviceLoader.impl.CaesarCipher;

module hortsmann_v_one {
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
    requires java.logging;
    requires java.prefs;

    exports ru.sectorsj._0_hello;
    opens ru.sectorsj._0_hello to javafx.fxml;
    exports ru.sectorsj._380_logging;
    uses ru.sectorsj._380_logging.LoggingImageViewer;
    // Открываем пакет java.util для доступа из нашего модуля
    //opens ru.sectorsj._260_objectAnalyzer;
    //opens java.util;
    uses ru.sectorsj._329_serviceLoader.Cipher;
    provides Cipher with CaesarCipher;
}