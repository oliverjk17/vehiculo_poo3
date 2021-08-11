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
public class vehiculo_aereo extends Vehiculo {
    private String puertas_emer,tipo;
    private int c_pasajeros,n_motores;
    public vehiculo_aereo(){}
   
    public vehiculo_aereo(String puertas_emer, String tipo , int c_pasajeros, String marca, String matricula, String modelo, String color, int cilindraje, int caballos) {
        super(marca, matricula, modelo, color, cilindraje, caballos);
        this.puertas_emer = puertas_emer;

        this.c_pasajeros = c_pasajeros;
        
      
    }

    public String getMaterial() {
        return puertas_emer;
    }

    public void setMaterial(String material) {
        this.puertas_emer = material;
    }

   

    public int getC_pasajeros() {
        return c_pasajeros;
    }

    public void setC_pasajeros(int c_pasajeros) {
        this.c_pasajeros = c_pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getN_motores() {
        return n_motores;
    }

    public void setN_motores(int n_motores) {
        this.n_motores = n_motores;
    }

    


    @Override
     public void encender(){}
    @Override
     public void apagar(){}
     
     public void despegar(){}
     public void aterrizar(){}
}
