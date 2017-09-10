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
public class Zona {
    private String NombreZ;
    private int Contadorz;
    private int NumeroZ;
    private Estacionamiento[] espacio;

    public Zona(String NombreZ, int NumeroZ) {
        this.NombreZ = NombreZ;
        this.NumeroZ = NumeroZ;
        this.Contadorz=0;
        this.espacio= new Estacionamiento[5];
    }

    public int getNumeroZ() {
        return NumeroZ;
    }

    public void setNumeroZ(int NumeroZ) {
        this.NumeroZ = NumeroZ;
    }

    public String getNombreZ() {
        return NombreZ;
    }

    public Estacionamiento[] getEspacio() {
        return espacio;
    }

    public void setNombreZ(String NombreZ) {
        this.NombreZ = NombreZ;
    }

    public void setEspacio(Estacionamiento[] espacio) {
        this.espacio = espacio;
    }

    public int getContadorz() {
        return Contadorz;
    }

    public void setContadorz(int Contadorz) {
        this.Contadorz = Contadorz;
    }
    public int ContarEs (){
        int contador=0;
        for (int i=0; i<5; i++){
            if (this.espacio[i].Lleno()){
            contador++;
            }
        }
        return contador;
    }
   public String Desocupado (){
       for (int i=0; i<5; i++){
           if (this.espacio[i].Lleno()==false){
               return "Estacionamiento "+this.espacio[i].getNumero();
           }
       }
       return null;
   }
   
   public boolean app(String placa){
       for (int i=0; i<5; i++){
           if (this.espacio[i].verificacion(placa)==true){
               return true;
           }
       }
       return false;
   }
   public String zona(String placa){
       for (int i=0; i<5; i++){
           if (this.espacio[i].verificacion(placa)==true){
               return this.NombreZ;
           }
       }
       return null;
   }
   public int est (String placa){
       for (int i=0; i<5; i++){
           if (this.espacio[i].est(placa)!=0){
               return this.espacio[i].est(placa);
           }
       }
       return 0;
   }
   public int cobrar (int horasalida, String placa){
       for (int i=0; i<5; i++){
           if (this.espacio[i].cobrar(horasalida, placa)!= 0){
               return this.espacio[i].cobrar(horasalida, placa);
           }
       }
       return 0;
   }
   public void agregarCarro(String placa, int horallegada){
       this.espacio[this.ContarEs()].agregarCarro(placa, horallegada);
   }
}
