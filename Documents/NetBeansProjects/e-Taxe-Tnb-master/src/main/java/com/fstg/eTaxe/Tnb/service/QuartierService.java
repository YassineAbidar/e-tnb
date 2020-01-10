/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.eTaxe.Tnb.service;

import com.fstg.eTaxe.Tnb.bean.Quartier;
import com.fstg.eTaxe.Tnb.bean.Rue;
import com.fstg.eTaxe.Tnb.bean.Secteur;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author yassine
 */
public interface QuartierService {

    public Quartier findByLibelle(String libelle);

//    public Quartier findByRue(Rue rue);

//    public List<Quartier> findBySecteur(Secteur secteur);

    public void save(Quartier quartier);

    public void deleteQuartier(long id);

    public List<Quartier> findAll();
    public Quartier findByid(long id);
    
    public int exitsts(long id);
      public List<Quartier> findSecteur();
      //public List<Quartier> findbyidLibelle(String libelle);
     public List<Quartier> findByidSecteur(long idSecteur);
     public  List<Quartier> findByLibelleSecteur(String libelleSecteur);
     public Quartier WhereStreetExist(long id);
     
   
    

}
