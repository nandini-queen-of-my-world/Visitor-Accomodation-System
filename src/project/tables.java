/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Nandini
 */
public class tables {
    public static void main(String[] args) {
        Connection con =null;
        Statement st=null;
        try{
            con=connections.getCon();
            st=con.createStatement();
         st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),sequrityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
           st.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int , status varchar(20))");
       st.executeUpdate("create table visitor(id int,name varchar(200),mobileNumber varchar(20), nationality varchar(200),email varchar(200),idProof varchar(200), address varchar(500), checkIn varchar(200), roomNo varchar(200),bed varchar(200),roomtype varchar(200),pricePerDay int(10),numberOfDaysStay int(10),totalAmount varchar(200),checkOut varchar(200))");
      // st.executeUpdate("create table otp(otp int)");
          JOptionPane.showMessageDialog(null, "Table created succcessfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally{
             try{
                 con.close();
                 st.close();
             }
        catch(Exception e){
        }
        }
    }
}
