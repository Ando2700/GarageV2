/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ITU
 */
public class Connect {
    public Connection getConnectionPostgres(String user, String pswd) throws Exception
    {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/garage", user, pswd);
        System.out.println(con); 
        return con;
    }
}
