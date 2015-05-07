/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.magmascientific.modelo.exame;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dirceu R Junior
 */
@Entity
public class Exame implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Float Hb;
    
    private Float Ht;
    
    private Float Ferro;
    
    private Float Ferritina;
    
    private Float RDW;
    
    private Float VCM;
    
    private Float VitaminaD3;
    
    private Float TSH;
    
    private Float GJ;
    
    private Float CT;
    
    private Float LDL;
    
    private Float HDL;
    
    private Float T4L;

}
