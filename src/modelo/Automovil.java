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
public class Automovil extends vehiculo_terrestre {
    private String t_freno,t_carro;
   
    public Automovil(){}
    public Automovil(String t_freno, String t_refrigeracion, String t_carro, int c_asientos, int n_puertas, String placa, String t_gasolina, int llantas, String marca, String matricula, String modelo, String color, int cilindraje, int caballos) {
        super(placa, t_gasolina, llantas, marca, matricula, modelo, color, cilindraje, caballos);
        this.t_freno = t_freno;
        
        this.t_carro = t_carro;
       
    }

    public String getT_freno() {
        return t_freno;
    }

    public void setT_freno(String t_freno) {
        this.t_freno = t_freno;
    }

   
    public String getT_carro() {
        return t_carro;
    }

    public void setT_carro(String t_carro) {
        this.t_carro = t_carro;
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
