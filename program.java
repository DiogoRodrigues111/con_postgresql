/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostCon;

import java.sql.*;

/**
 *
 * @author diogo rodrigues roessler
 */
public class program {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/diogo_database", "postgres", "*******");
        } catch(Exception e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        }
        System.out.println("database successfully");
    }
    
}
