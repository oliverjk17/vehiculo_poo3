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
abstract class Vehiculo {
     public String marca,matricula,modelo,color,transmision;
     public int cilindraje,motor;
     public Vehiculo(){}

    public Vehiculo(String transmision) {
        this.transmision = transmision;
    }
    
   
     
    public Vehiculo(String marca, String matricula, String modelo, String color, int cilindraje, int motor) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.motor = motor;
    }
     
     

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCaballos() {
        return motor;
    }

    public void setCaballos(int caballos) {
        this.motor = caballos;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
        protected void agregar(){}
     public void encender(){}
     public void apagar(){}
}
