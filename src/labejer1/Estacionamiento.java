/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labejer1;

/**
 *
 * @author Estudiante
 */
public class Estacionamiento {
    private int Numero;
    private Carro carros;

    public Estacionamiento(int Numero) {
        this.Numero = Numero;
        this.carros=null;
    }   
    public int getNumero() {
        return Numero;
    }

    public Carro getCarros() {
        return carros;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setCarros(Carro carros) {
        this.carros = carros;
    }
    public boolean Lleno (){
        return this.carros != null;
    }
    public int Infosalida (Carro carros){
        if (carros==this.carros){
            return this.Numero;
        }
        else{
            return 0;
        }
    }
    public boolean verificacion(String placa){
        return this.carros.getPlaca().equals(placa);
    }
    public int est(String placa){
        if(this.carros.getPlaca().equals(placa)){
            return this.Numero;
        }
        return 0;
    }
    public int cobrar (int horasalida, String placa){
        if(this.carros.getPlaca().equals(placa)){
            return this.carros.getHorallegada();
        }
        return 0;
    }
    public void agregarCarro (String placa, int horallegada){
      Carro carro=new Carro(placa, horallegada);
         this.carros =carro;
    }
}
