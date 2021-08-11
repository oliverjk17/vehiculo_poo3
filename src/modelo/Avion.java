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
public class Avion extends vehiculo_aereo {
    private String t_pasajero;
    private int turbinas,n_puertas;
    public Avion(){}
   
    public String getT_pasajero() {
        return t_pasajero;
    }

    public void setT_pasajero(String t_pasajero) {
        this.t_pasajero = t_pasajero;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public int getN_puertas() {
        return n_puertas;
    }

    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }
    
    @Override
     public void encender(){}
    @Override
     public void apagar(){}
     
    @Override
     public void despegar(){}
    @Override
     public void aterrizar(){}
     public void recargar(){}
    
}
