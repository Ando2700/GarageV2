/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import modele.Candidat;

/**
 *
 * @author ITU
 */
public class CandidatDao {
    
    public Connection getConnectionPostgres() throws Exception
    {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/garage","postgres","Mdpprom15");
        System.out.println(con); 
        return con;
    }
    
    public void insert(Candidat cdd) throws SQLException {
        Connection co = null;
        String rep = "";
        try{
            co = this.getConnectionPostgres();
             rep = "insert into candidat(nom, prenom, date_naissance,specialite, id_niveau,id_sexe ) values ('"+cdd.getNom()+"','"+cdd.getPrenom()+"','"+cdd.getDateNaissance()+"','"+cdd.getSpecialite()+"',"+cdd.getSexe().getId_sexe()+","+cdd.getNiveau().getId_niveau()+")";
            Statement pstmt = co.createStatement();
            pstmt.executeQuery(rep);
            co.commit();
        }catch(Exception e){
        }finally{
            co.close();
        }
    }
}
