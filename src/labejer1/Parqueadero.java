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
public class Parqueadero {
    private String NombreP;
    private int Tarifa;
    private Zona[] zonas;
   

    public Parqueadero(String NombreP, int Tarifa) {
        this.NombreP = NombreP;
        this.Tarifa = Tarifa;
        this.zonas= new Zona[3];
    }

    public String getNombreP() {
        return NombreP;
    }

    public int getTarifa() {
        return Tarifa;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public void setTarifa(int Tarifa) {
        this.Tarifa = Tarifa;
    }

    public Zona[] getzonas() {
        return zonas;
    }

    public void setzonas(Zona[] zonas) {
        this.zonas = zonas;
    }
    public String ZonaMenos (){
        if(this.zonas[0].ContarEs()==5 && this.zonas[1].ContarEs()==5&& this.zonas[2].ContarEs()==5){
            return "Parquedero lleno regrese despues, gracias por su visita"; 
        }
        else{
           if(this.zonas[0].ContarEs()<=this.zonas[1].ContarEs()){
               if(this.zonas[0].ContarEs()<=this.zonas[2].ContarEs()){
                   return this.zonas[0].getNombreZ();
               }
               else{
                  return this.zonas[2].getNombreZ();           
               }
           }
           else{
               if(this.zonas[1].ContarEs()<=this.zonas[0].ContarEs()){
                    if(this.zonas[1].ContarEs()<=this.zonas[2].ContarEs()){
                        return this.zonas[1].getNombreZ();
               }
               else{
                    return this.zonas[2].getNombreZ();           
               }
                   
               }
           }
               
        }
        return null;
    }
    public String Estacionar (String nombre){
        for (int i=0; i<3; i++){
          if(this.zonas[i].getNombreZ().equals(nombre)){
              return this.zonas[i].Desocupado();
          }  
        }
        return null;
    } 
    
    public boolean estacarro(String placa){
        for (int i=0; i<3; i++){
            if(this.zonas[i].app(placa)==true){
                return true;
            }
        }
        return false;
    }
    public String zona(String placa){
        for (int i=0; i<3; i++){
            if(this.zonas[i].zona(placa).equals(this.zonas[i].getNombreZ())){
                return this.zonas[i].getNombreZ();
            }
        }
        return null;
    }
    public int zonan(String placa){
        for (int i=0; i<3; i++){
            if(this.zonas[i].zona(placa).equals(this.zonas[i].getNombreZ())){
                return this.zonas[i].getNumeroZ();
            }
        }
        return 0;
    }
    public int est(String placa){
        for (int i=0; i<3; i++){
            if(this.zonas[i].est(placa)!=0){
                return this.zonas[i].est(placa);
            }
        }
        return 0;
    }
    public int cobrar(int horasalida, String placa){
        int a, b, c, d;
        for (int i=0; i<3; i++){
            d=horasalida-this.zonas[i].cobrar(horasalida, placa);
            if (d>=1 && d<=59){
                c=d*this.Tarifa;
                return c;
            }
            if(d>=100){
                b=(d%100)*this.Tarifa;
                a=(d/100)*this.Tarifa*60;
                c=a+b;
                return c;
            }
        }
        
        return 0;
    }
    public void agregarCarro(String placa, int horallegada, String zona){
        for (int i=0; i<3; i++){
          if(zona.equals(this.zonas[i].getNombreZ())){
            this.zonas[i].agregarCarro(placa, horallegada);
          } 
        }
    }
    
}
