/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labejer1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author myd.abogados
 */
public class main {
     public static void main(String[] args){
         City bogota = new City();
        Robot grua = new Robot(bogota, 5, -1, Direction.EAST,20);
        for (int i=0; i<13; i++){
           Wall w3 = new Wall(bogota, -1, i, Direction.NORTH);
        }
        for (int i=0; i<13; i++){
           Wall w3 = new Wall(bogota, 5, i, Direction.SOUTH);
        }
        for (int i=0; i<11; i++){
           Wall w3 = new Wall(bogota, 4, i, Direction.SOUTH);
        }
        Wall w7 = new Wall(bogota, 4, 12, Direction.SOUTH);
        Wall w17 = new Wall(bogota, 5, 12, Direction.EAST);
        for (int i=10; i<13; i++){
           Wall w3 = new Wall(bogota, 2, i, Direction.SOUTH);
        }
        for (int i=-1; i<5; i++){
           Wall w1 = new Wall(bogota, i, 0, Direction.WEST);
        }
        for (int i=-1; i<5; i++){
           Wall w1 = new Wall(bogota, i, 12, Direction.EAST);
        }
        for (int i=-1; i<4; i++){
           Wall w4 = new Wall(bogota, i, 3, Direction.WEST);
        }
        for (int i=-1; i<4; i++){
           Wall w2 = new Wall(bogota, i, 2, Direction.EAST);
        }
        for (int i=-1; i<4; i++){
           Wall w5 = new Wall(bogota, i, 6, Direction.WEST);
        }
        for (int i=-1; i<4; i++){
           Wall w6 = new Wall(bogota, i, 5, Direction.EAST);
        }
        for (int i=-1; i<4; i++){
           Wall w5 = new Wall(bogota, i, 9, Direction.WEST);
        }
        for (int i=-1; i<4; i++){
           Wall w6 = new Wall(bogota, i, 8, Direction.EAST);
        }
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
        Carro c1 =new Carro("UCR821",1200);
        e1[0].setCarros(c1);
        System.out.println(p.cobrar(1430, "UCR821"));
        grua.turnLeft();
        
     }
}
