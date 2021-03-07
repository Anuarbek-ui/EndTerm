package data.interfaces;

import java.sql.Connection;

public interface IDBManager {
    public Connection getConnection();
}