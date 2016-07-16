/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgusol.Xtras;

import java.sql.*;

public class DBInterface {
    public Connection DBconnection;
    private final Statement stmt;
    
    public DBInterface (String DBip, String DBname, String DBuser, String DBpassword) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DBconnection = DriverManager.getConnection("jdbc:mysql://"+DBip+"/"+DBname, DBuser, DBpassword);
        //DBconnection = DriverManager.getConnection("jdbc:mysql://johnny.heliohost.org:3306/lisson_sisgusol","lisson_admin","A10072408");
        stmt = DBconnection.createStatement();
    }    
    
    public void createTable (String sql) throws SQLException {
        stmt.executeUpdate(sql);
    }
    
    public ResultSet select (String sql) throws SQLException {
        ResultSet rs = stmt.executeQuery(sql);
        return rs;
    }
    
    public void insert (String sql) throws SQLException {
        stmt.executeUpdate(sql);
    }
    
}
