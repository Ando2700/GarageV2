/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;
import java.time.Period;
import java.time.LocalDate;
import java.lang.Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ITU
 */
public class Candidat {
    int id;
    String nom;
    String prenom;
    String dateNaissance;
    String specialite;
    Sexe sexe;
    TypeNiveau niveau;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance)throws Exception {
        String[] dtNaiss = dateNaissance.split("-");
        int year = Integer.valueOf(dtNaiss[0]);
        LocalDate dt = LocalDate.now();
        int yearNow = dt.getYear();
        int diff = yearNow-year;
        if(diff>18){
            this.dateNaissance = dateNaissance;
        }
        else{
            throw new Exception("Vous etes Mineur");
        }
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public TypeNiveau getNiveau() {
        return niveau;
    }

    public void setNiveau(TypeNiveau niveau) {
        this.niveau = niveau;
    }
    
    
}
