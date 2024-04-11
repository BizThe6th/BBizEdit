module org.biz.bbizedit {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.biz.bbizedit to javafx.fxml;
    exports org.biz.bbizedit;
}