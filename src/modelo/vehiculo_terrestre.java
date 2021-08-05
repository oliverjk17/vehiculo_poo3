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
public class vehiculo_terrestre extends Vehiculo {
    private String placa,chasis;
    private int llantas;
    public vehiculo_terrestre(){}
    public vehiculo_terrestre(String placa, String chasis, int llantas, String marca, String matricula, String modelo, String color, int cilindraje, int caballos) {
        super(marca, matricula, modelo, color, cilindraje, caballos);
        this.placa = placa;
        this.chasis = chasis;
        this.llantas = llantas;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getT_gasolina() {
        return chasis;
    }

    public void setT_gasolina(String t_gasolina) {
        this.chasis = t_gasolina;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    @Override
     public void encender(){}
    @Override
     public void apagar(){}
     
     public void acelerar(){}
     public void frenar(){}
}
