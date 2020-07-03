
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi
 */
public class CRUD {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
   
    private static final String USER = "ufnprojetomove";

    private static final String PASS = "USc5KrG_77nwVC";
    
    private static final String URL = "jdbc:mysql://ufnprojetomove.mysql.dbaas.com.br:3306/ufnprojetomove?useTimeZone=true&serverTimezone=UTC&user="+USER+"&password="+PASS;
    
    Connection c;
    Statement stmt = null;
    
    public void connect() {
        try {
            Class.forName(DRIVER).newInstance();
             c = DriverManager.getConnection(URL);
            System.out.println("Conectado!");           
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        }
    }

    ResultSet getFinancas() throws SQLException {
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `Financas`"); 
           
            return rs;
            
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        } 
        return null;
    }
    
    boolean deleteProduct(int index) {
        try {
            connect();
            stmt = c.createStatement();
            int result = stmt.executeUpdate("DELETE FROM `Financas` WHERE `ID` = "+index+";"); 

           if (result == 1)
               return true;
            
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        } 
        return false;
    }
    
    ResultSet getAvaliacoes() throws SQLException {
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `Avaliacao`"); 
           
            return rs;
            
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        } 
        return null;
    }
    
    boolean deleteAvaliacoes(int index) {
        try {
            connect();
            stmt = c.createStatement();
            int result = stmt.executeUpdate("DELETE FROM `Avaliacao` WHERE `ID` = "+index+";"); 

           if (result == 1)
               return true;
            
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        } 
        return false;
    }
    
    boolean updateAvaliacoes(AvaliacoesBanco a) {
        try {
            connect();
            stmt = c.createStatement();
            int result = stmt.executeUpdate("UPDATE `Avaliacao` SET `SUBMISSAO`= '"+a.getSubmissao()+
                    "',`AVALIADOR`='"+a.getAvaliador()+
                    "',`DATA_DO_PARECER`='"+a.getDataParecer()+
                    "',`ARQUIVO`= '"+a.getArquivoProjeto()+
                    "',`STATUS`='"+a.getStatus()+
                    "' WHERE `ID` = "+a.getId()); 

           if (result == 1)
               return true;
            
        } catch (Exception e) {
            System.out.println("e: " + e);
            JOptionPane.showMessageDialog(null, e);           
        } 
        return false;
    }  
}