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
    private String material;
    private int altura,c_pasajeros,v_maxima;
    public vehiculo_aereo(){}
    public vehiculo_aereo(String material, int altura, int c_pasajeros, int v_maxima, String marca, String matricula, String modelo, String color, int cilindraje, int caballos) {
        super(marca, matricula, modelo, color, cilindraje, caballos);
        this.material = material;
        this.altura = altura;
        this.c_pasajeros = c_pasajeros;
        
        this.v_maxima = v_maxima;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getC_pasajeros() {
        return c_pasajeros;
    }

    public void setC_pasajeros(int c_pasajeros) {
        this.c_pasajeros = c_pasajeros;
    }

    

    public int getV_maxima() {
        return v_maxima;
    }

    public void setV_maxima(int v_maxima) {
        this.v_maxima = v_maxima;
    }

    @Override
     public void encender(){}
    @Override
     public void apagar(){}
     
     public void despegar(){}
     public void aterrizar(){}
}
