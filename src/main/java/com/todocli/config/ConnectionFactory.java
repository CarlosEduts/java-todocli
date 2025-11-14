package com.todocli.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalTime;

public class ConnectionFactory {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/todocli";
        String username = "root";
        String password = "root";

        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new IllegalStateException("[Config] " + LocalTime.now() + " - Erro ao se conectar com o banco de dados", e);
        }
    }
}
