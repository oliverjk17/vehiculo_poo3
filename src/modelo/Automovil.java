/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Walter Monge
 */
public class Automovil extends vehiculo_terrestre {
    private String t_freno,t_refrigeracion,t_carro;
    private int c_asientos, n_puertas;
    public Automovil(){}
    public Automovil(String t_freno, String t_refrigeracion, String t_carro, int c_asientos, int n_puertas, String placa, String t_gasolina, int llantas, String marca, String matricula, String modelo, String color, int cilindraje, int caballos) {
        super(placa, t_gasolina, llantas, marca, matricula, modelo, color, cilindraje, caballos);
        this.t_freno = t_freno;
        this.t_refrigeracion = t_refrigeracion;
        this.t_carro = t_carro;
        this.c_asientos = c_asientos;
        this.n_puertas = n_puertas;
    }

    public String getT_freno() {
        return t_freno;
    }

    public void setT_freno(String t_freno) {
        this.t_freno = t_freno;
    }

    public String getT_refrigeracion() {
        return t_refrigeracion;
    }

    public void setT_refrigeracion(String t_refrigeracion) {
        this.t_refrigeracion = t_refrigeracion;
    }

    public String getT_carro() {
        return t_carro;
    }

    public void setT_carro(String t_carro) {
        this.t_carro = t_carro;
    }

    public int getC_asientos() {
        return c_asientos;
    }

    public void setC_asientos(int c_asientos) {
        this.c_asientos = c_asientos;
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
     public void acelerar(){}
    @Override
     public void frenar(){}
     public void abrir_puertas(){}
     public void abrir_ventanas(){}
    
}
