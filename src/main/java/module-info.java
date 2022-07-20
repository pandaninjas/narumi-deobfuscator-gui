module NarumiDeobfGUI {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires Deobfuscator;
    requires org.objectweb.asm;
    opens gq.malwarefight.narumiideobfgui to javafx.fxml;
}