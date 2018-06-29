module com.l2jbr.gameserver {
    requires com.l2jbr.commons;
    requires com.l2jbr.mmocore;

    requires java.sql;
    requires java.desktop;
    requires org.slf4j;
    requires java.scripting;
    requires jython.standalone;
    requires spring.data.commons;
    requires spring.data.jdbc;
    requires spring.context;
    requires java.xml.bind;

    exports com.l2jbr.gameserver;
    exports com.l2jbr.gameserver.model.entity.database.repository;
    exports com.l2jbr.gameserver.model.entity.database;

}