/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgusol.Xtras;

import java.sql.*;

public class DBInterface {
    public String DBip;
    public String DBname;
    public String DBuser;
    public Connection DBconnection;
    private final Statement stmt;
    
    public DBInterface (String DBip, String DBname, String DBuser, String DBpassword) throws ClassNotFoundException, SQLException {
        this.DBip = DBip;
        this.DBname = DBname;
        this.DBuser = DBuser;        
        Class.forName("com.mysql.jdbc.Driver");
        DBconnection = DriverManager.getConnection("jdbc:mysql://"+DBip+"/"+DBname, DBuser, DBpassword);
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
