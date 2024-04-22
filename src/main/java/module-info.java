module sn.dev.javafxchatgroupwithsockets {
    requires javafx.controls;
    requires javafx.fxml;


    opens sn.dev.javafxchatgroupwithsockets to javafx.fxml;
    exports sn.dev.javafxchatgroupwithsockets;
}