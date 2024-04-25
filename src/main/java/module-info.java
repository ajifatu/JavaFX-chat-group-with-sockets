module sn.dev.javafxchatgroupwithsockets {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;


    opens sn.dev.javafxchatgroupwithsockets to javafx.fxml;
    exports sn.dev.javafxchatgroupwithsockets;

    opens sn.dev.javafxchatgroupwithsockets.entity;
}