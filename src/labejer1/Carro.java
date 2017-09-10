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
public class Carro {
    private String placa;
    private int horallegada;
   
    public Carro(String placa, int horallegada) {
        this.placa = placa;
        this.horallegada = horallegada;
    }

    

    

    public String getPlaca() {
        return placa;
    }

    public int getHorallegada() {
        return horallegada;
    }

   

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setHorallegada(int horallegada) {
        this.horallegada = horallegada;
    }
    
    
}
