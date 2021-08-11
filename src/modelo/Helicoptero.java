/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author oliver kies
 */
public class Helicoptero extends vehiculo_aereo {
    private String t_atterizaje, t_heli;
    private int c_elices;
    public Helicoptero(){}
  

    public String getT_atterizaje() {
        return t_atterizaje;
    }

    public void setT_atterizaje(String t_atterizaje) {
        this.t_atterizaje = t_atterizaje;
    }

    public String getT_heli() {
        return t_heli;
    }

    public void setT_heli(String t_heli) {
        this.t_heli = t_heli;
    }

    public int getC_elices() {
        return c_elices;
    }

    public void setC_elices(int c_elices) {
        this.c_elices = c_elices;
    }
    
    @Override
     public void encender(){}
    @Override
     public void apagar(){}
     
    @Override
     public void despegar(){}
    @Override
     public void aterrizar(){}
    public void abrir_ventanas(){}
}
