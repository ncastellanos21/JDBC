module com.pluralcamp.daw.persistence {
    requires java.base;
    requires java.sql;
    requires mysql.connector.java;
    requires com.pluralcamp.daw.entities;

    exports com.pluralcamp.daw.persistence.daos.contracts;
    exports com.pluralcamp.daw.persistence.exceptions;
}