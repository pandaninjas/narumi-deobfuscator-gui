module NarumiDeobfGUI {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
//    requires Deobfuscator;
    requires org.objectweb.asm;
    requires Deobfuscator.edd277a;
    opens gq.malwarefight.narumiideobfgui to javafx.fxml;
    exports gq.malwarefight.narumiideobfgui to javafx.graphics;
}