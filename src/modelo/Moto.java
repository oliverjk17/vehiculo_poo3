package modelo;
/**
 *
 * @author oliver kies
 */
public class Moto extends vehiculo_terrestre {
    private String t_moto;
    private int t_llanta,peso,altura;
    public Moto(){}
    public Moto(String t_moto,  int t_llanta, int peso, int altura, String placa, String t_gasolina, int llantas, String marca, String matricula, String modelo, String color, int cilindraje, int caballos) {
        super(placa, t_gasolina, llantas, marca, matricula, modelo, color, cilindraje, caballos);
        this.t_moto = t_moto;

        this.t_llanta = t_llanta;
        this.peso = peso;
        this.altura = altura;
    }

    public String getT_moto() {
        return t_moto;
    }

    public void setT_moto(String t_moto) {
        this.t_moto = t_moto;
    }

   

    public int getT_llanta() {
        return t_llanta;
    }

    public void setT_llanta(int t_llanta) {
        this.t_llanta = t_llanta;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
     public void encender(){}
    @Override
     public void apagar(){}
     
    @Override
     public void acelerar(){}
    @Override
     public void frenar(){}
     public void maniobras(){}
}
