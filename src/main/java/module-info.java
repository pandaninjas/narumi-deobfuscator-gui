module NarumiDeobfGUI {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires org.objectweb.asm;
    requires Deobfuscator.b0599f6;
    opens gq.malwarefight.narumiideobfgui to javafx.fxml;
    exports gq.malwarefight.narumiideobfgui to javafx.graphics;
}
