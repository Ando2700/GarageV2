/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CandidatDao;
import static java.lang.System.out;
import modele.Candidat;

/**
 *
 * @author ITU
 */
public class CandidatService {
    
    public String insertion(Candidat cdd){
        String rep = "";
        try{
            CandidatDao cddD = new CandidatDao();
            cddD.insert(cdd);
        }catch (Exception e){
            rep = e.getMessage();
        }
        return rep;
    }
}
