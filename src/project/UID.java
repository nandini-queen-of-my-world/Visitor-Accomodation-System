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
public class UID {
    public static void setData(String Query, String msg){
        Connection con=null;
         Statement st=null;
        try{
            con=connections.getCon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null,msg);
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
        finally{
         try{}
        catch(Exception e){}
        }
        }
    }

