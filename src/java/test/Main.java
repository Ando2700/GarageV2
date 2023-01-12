/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Candidat;
import modele.Sexe;
import modele.TypeNiveau;
import service.CandidatService;

/**
 *
 * @author ITU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candidat cdd = new Candidat();
            cdd.setNom("Kim");
            cdd.setPrenom("Namjoon");
            Sexe sx = new Sexe();
        sx.setId_sexe(1);
        
        TypeNiveau niveau = new TypeNiveau();
        niveau.setId_niveau(1);
            cdd.setNiveau(niveau);
            cdd.setSexe(sx);
            cdd.setSpecialite("mecano");
        try {
            //cdd.setDateNaissance(Date.valueOf("2000-12-10"));
            
            CandidatService svr = new CandidatService();
            String rep = svr.insertion(cdd);
            System.out.print(rep);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
