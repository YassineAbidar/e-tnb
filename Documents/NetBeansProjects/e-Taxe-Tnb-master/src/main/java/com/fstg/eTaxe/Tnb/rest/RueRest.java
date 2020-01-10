/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.eTaxe.Tnb.rest;

import com.fstg.eTaxe.Tnb.bean.Quartier;
import com.fstg.eTaxe.Tnb.bean.Rue;
import com.fstg.eTaxe.Tnb.service.QuartierService;
import com.fstg.eTaxe.Tnb.service.RueService;
import java.util.List;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yassine
 */

@RestController
@RequestMapping("/e-Taxe-Tnb/rue")
public class RueRest {
     @Autowired
    private  RueService rueService;
     @Autowired
     private QuartierService quartierService;
    
     //tested
    @GetMapping(value="/libelle/{libelle}")
    public Rue findByLibelle(@PathVariable String libelle) {
        return rueService.findByLibelle(libelle);
    }
    
//    @GetMapping(value="/quartier/{quartier}")
//    public List<Rue> findByQuartier(@PathVariable Quartier quartier) {
//        return rueService.findByQuartier(quartier);
//    }
    
    //tested
    @GetMapping(value="/")
    public List<Rue> findAll() {
        return rueService.findAll();
    }
    
    //tested
    @PostMapping(value="/")
    public void save(@RequestBody Rue rue) {
       // quartierService.save(rue.getQuartier());
        rueService.save(rue);
    }
    
    //tested
    @DeleteMapping(value="/id/{id}")
    public void deleteRue(@PathVariable long id) {
        rueService.deleteRue(id);
    }
    // already test
    @GetMapping("/idquartier/{idquartier}")
    public List<Rue> findByIdQuartier(@PathVariable long idquartier) {
        return rueService.findByIdQuartier(idquartier);
    }
  @GetMapping("/libelleQuartie/{libelleQuartie}")
    public List<Rue> findByLibelleQuartier(String libelleQuartie) {
        return rueService.findByLibelleQuartier(libelleQuartie);
    }
   @GetMapping("/id/{id}")
    public Rue findByid(@ PathVariable long id) {
        return rueService.findByid(id);
    }
     @GetMapping("/idTerrain/{idTerrain}")
    public Rue WhereTerrainExist(@ PathVariable long idTerrain) {
        return rueService.WhereTerrainExist(idTerrain);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
