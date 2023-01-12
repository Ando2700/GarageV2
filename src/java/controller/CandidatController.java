/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Candidat;
import modele.Sexe;
import modele.TypeNiveau;
import service.CandidatService;

/**
 *
 * @author ITU
 */
public class CandidatController extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String dtNaiss  = request.getParameter("date");
        int niv = Integer.valueOf(request.getParameter("niveau"));
        int sexe = Integer.valueOf(request.getParameter("sexe"));
        String spc = request.getParameter("specialite");
        
        Sexe sx = new Sexe();
        sx.setId_sexe(sexe);
        
        TypeNiveau niveau = new TypeNiveau();
        niveau.setId_niveau(niv);
        try{
            Candidat cdd = new Candidat();
            cdd.setNom(nom);
            cdd.setPrenom(prenom);
            cdd.setDateNaissance(dtNaiss);
            cdd.setNiveau(niveau);
            cdd.setSexe(sx);
            cdd.setDateNaissance(dtNaiss);
            cdd.setSpecialite(spc);
            
            CandidatService svr = new CandidatService();
            String rep = svr.insertion(cdd);
        }catch(Exception e){
            out.print(e.getMessage());
        }
    }



}
