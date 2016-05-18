/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgusol.Xtras;

import java.sql.*;

public class DBInterface {
    public Connection DBconnection;
    
    public DBInterface (String DBip, String DBname, String DBuser, String DBpassword) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DBconnection = DriverManager.getConnection("jdbc:mysql://"+DBip+"/"+DBname, DBuser, DBpassword);
    
    }    
    
}
