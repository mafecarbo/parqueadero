/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labejer1;

/**
 *
 * @author myd.abogados
 */
public class main {
    public static void main(String[] args) {
        Parqueadero p =new Parqueadero("parking", 85);
        Zona [] z= new Zona [3]; 
        for (int i=0; i<3; i++){
            z[i]= new Zona ("Zona "+(i+1), i+1);
        }
        p.setzonas(z);
        Estacionamiento[] e1= new Estacionamiento[5];
        Estacionamiento[] e2= new Estacionamiento[5];
        Estacionamiento[] e3= new Estacionamiento[5];
        for (int i=0; i<5; i++){
            e1[i]= new Estacionamiento (i+1);
        }
        z[0].setEspacio(e1);
        for (int i=0; i<5; i++){
            e2[i]= new Estacionamiento (i+1);
        }
        z[1].setEspacio(e2);
        for (int i=0; i<5; i++){
            e3[i]= new Estacionamiento (i+1);
        }
        z[2].setEspacio(e3);
        String placa1 ="placa";
        String placa2 ="placa2";
        p.agregarCarro(placa1, 0, p.ZonaMenos());
        p.agregarCarro(placa2, 0, p.ZonaMenos());
        System.out.println(e1[0].getCarros().getPlaca());
        System.out.println(e2[0].getCarros().getPlaca());
        System.out.println(p.zona(placa2,"Zona 2") );
        System.out.println(p.est(placa2,"Zona 2") );
    }
    
}
