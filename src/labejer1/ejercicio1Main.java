/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labejer1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class ejercicio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
            z[i]= new Zona ("zona"+(i+1), i+1);
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
        boolean f=true;
        int total = 0;
        while(f=true){
            System.out.println("Bienvenido a "+p.getNombreP()+" nuestra tarifa por hora es de "+p.getTarifa()+" pesos, por favor introduzca el numero de la opcion que desea.\n1.Ingresar\n2.Sacar su carro\n3.Revisar ubicacion del carro\n4.Mirar ganancias del parqueadero hasta el momento\n5.Salir"); 
            int a;
            Scanner flujoEn= new Scanner(System.in);
            a=flujoEn.nextInt();
            switch(a){
                case 1:{
                    for(int i=0; i<12; i++){
                        grua.move();
                    }
                    grua.turnLeft();
                    grua.move();
                    grua.turnLeft();
                    System.out.println("Bienvenido, por favor digite los siguientes datos:\n1.Placas de su carro.");
                    String placa;
                    placa=flujoEn.next();
                    System.out.println("2.Hora de llegada.");
                    int hora;
                    
                    hora=flujoEn.nextInt();           
                    if("zona1".equals(p.ZonaMenos())){
                      
                        for(int i=0; i<10;i++){
                            grua.move();
                        }
                        for(int i=0; i<3; i++){
                            grua.turnLeft();
                        }
                        if ("Estacionamiento 1".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<5;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<5;i++){
                                grua.move();
                            }
                       
                        }
                        if ("Estacionamiento 2".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<4;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<4;i++){
                                grua.move();
                            }
                            
                        }
                        if ("Estacionamiento 3".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<3;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<3;i++){
                                grua.move();
                            }
                            
                        }
                        if ("Estacionamiento 4".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<2;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<2;i++){
                                grua.move();
                            }
                           
                        }
                        if ("Estacionamiento 5".equals(p.Estacionar(p.ZonaMenos()))){
                            grua.move();
                            grua.putThing();
                            grua.turnLeft();
                            grua.move();
                        }
                        grua.turnLeft();
                        for(int i=0; i<10;i++){
                            grua.move();
                        }
                        
                    }
                    if("zona2".equals(p.ZonaMenos())){
                        
                        for(int i=0; i<7;i++){
                            grua.move();
                        }
                        for(int i=0; i<3; i++){
                            grua.turnLeft();
                        }
                        if ("Estacionamiento 1".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<5;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<5;i++){
                                grua.move();
                            }
                        }
                        if ("Estacionamiento 2".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<4;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<4;i++){
                                grua.move();
                            }
                        }
                        if ("Estacionamiento 3".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<3;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<3;i++){
                                grua.move();
                            }
                        }
                        if ("Estacionamiento 4".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<2;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<2;i++){
                                grua.move();
                            }
                        }
                        if ("Estacionamiento 5".equals(p.Estacionar(p.ZonaMenos()))){
                            grua.move();
                            grua.putThing();
                            grua.turnLeft();
                            grua.move();
                            
                        }
                        grua.turnLeft();
                        for(int i=0; i<7;i++){
                            grua.move();
                        }
                        
                    }
                    
                    if("zona3".equals(p.ZonaMenos())){
                        
                        for(int i=0; i<4;i++){
                            grua.move();
                        }
                        for(int i=0; i<3; i++){
                            grua.turnLeft();
                        }
                        if ("Estacionamiento 1".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<5;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<5;i++){
                                grua.move();
                            }
                        }
                        if ("Estacionamiento 2".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<4;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<4;i++){
                                grua.move();
                            }
                        }
                        if ("Estacionamiento 3".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<3;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<3;i++){
                                grua.move();
                            }
                        }
                        if ("Estacionamiento 4".equals(p.Estacionar(p.ZonaMenos()))){
                            for(int i=0; i<2;i++){
                                grua.move();
                            }
                            grua.putThing();
                            for(int i=0; i<2;i++){
                                grua.turnLeft();
                            }
                            for(int i=0; i<2;i++){
                                grua.move();
                            }
                        }
                        if ("Estacionamiento 5".equals(p.Estacionar(p.ZonaMenos()))){
                            grua.move();
                            grua.putThing();
                            grua.turnLeft();
                            grua.move();
                        }
                        grua.turnLeft();
                        for(int i=0; i<4;i++){
                            grua.move();
                        }
                        
                    }
                    if("Parquedero lleno regrese despues, gracias por su visita".equals(p.Estacionar(p.ZonaMenos()))){
                        System.out.println("Parquedero lleno regrese despues, gracias por su visita");
                    }
                    for(int i=0; i<3;i++){
                        grua.turnLeft();
                    }
                    grua.move();
                    for(int i=0; i<3;i++){
                        grua.turnLeft();
                    }
                    for(int i=0; i<12;i++){
                        grua.move();
                    }
                    for(int i=0; i<2;i++){
                        grua.turnLeft();
                    }
                    System.out.println("No se le ovide que su carro esta en la zona: "+p.ZonaMenos()+". Ya que con el conocimiento de esa zona podra sacar su auto");
                    p.agregarCarro(placa, hora, p.ZonaMenos());
                    System.out.println("Si desea volver a nuestro menu de opciones escriba true, si por otro lado desea salir escriba false");
                    f=flujoEn.nextBoolean();
                    break;
                }
                case 2:{
                    for(int i=0; i<12; i++){
                        grua.move();
                    }
                    grua.turnLeft();
                    grua.move();
                    grua.turnLeft();
                    System.out.println("Para retirar su carro por favor escriba las placas y la Zona en la que se encuentra su carro");
                    String placasalida;
                    String zona;
                    placasalida=flujoEn.next();
                    zona=flujoEn.next();
                    int horasalida;
                    if(p.estacarro(placasalida, zona)==false){
                       System.out.println("Su carro no se encuentra en este parqueadero");
                       break;
                    }
                    else{
                        switch(p.zona(placasalida, zona)){
                            case 1: {
                                for(int i=0; i<10;i++){
                                grua.move();
                            }
                            for(int i=0; i<3; i++){
                                grua.turnLeft();
                            }
                            switch(p.est(placasalida,zona)){
                                case 1:{
                                    if(z[0].ContarEs()==1){
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[0].setCarros(null);
                                }
                                if(z[0].ContarEs()==2){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[0].setCarros(e1[1].getCarros());
                                    e1[1].setCarros(null);
                                }
                                if(z[0].ContarEs()==3){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[0].setCarros(e1[1].getCarros());
                                    e1[1].setCarros(e1[2].getCarros());
                                    e1[2].setCarros(null);
                                }
                                if(z[0].ContarEs()==4){
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[0].setCarros(e1[1].getCarros());
                                    e1[1].setCarros(e1[2].getCarros());
                                    e1[2].setCarros(e1[3].getCarros());
                                    e1[3].setCarros(null); 
                                }
                                if(z[0].ContarEs()==5){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[0].setCarros(e1[1].getCarros());
                                    e1[1].setCarros(e1[2].getCarros());
                                    e1[2].setCarros(e1[3].getCarros());
                                    e1[3].setCarros(e1[4].getCarros());
                                    e1[4].setCarros(null);
                                }
                                break;
                                }
                                case 2:{
                                    if(z[0].ContarEs()==2){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[1].setCarros(null);
                                }
                                if(z[0].ContarEs()==3){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[1].setCarros(e1[2].getCarros());
                                    e1[2].setCarros(null);
                                }
                                if(z[0].ContarEs()==4){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida,zona)+total;
                                    e1[1].setCarros(e1[2].getCarros());
                                    e1[2].setCarros(e1[3].getCarros());
                                    e1[3].setCarros(null);
                                }
                                if(z[0].ContarEs()==5){
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[1].setCarros(e1[2].getCarros());
                                    e1[2].setCarros(e1[3].getCarros());
                                    e1[3].setCarros(e1[4].getCarros());
                                    e1[4].setCarros(null); 
                                }
                                break;
                                }
                                case 3:{
                                    if(z[0].ContarEs()==3){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[2].setCarros(null);
                                }
                                if(z[0].ContarEs()==4){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[2].setCarros(e1[3].getCarros());
                                    e1[3].setCarros(null);
                                }
                                if(z[0].ContarEs()==5){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[2].setCarros(e1[3].getCarros());
                                    e1[3].setCarros(e1[4].getCarros());
                                    e1[4].setCarros(null);
                                }
                                break;
                                }
                                case 4: {
                                    if(z[0].ContarEs()==4){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[3].setCarros(null);
                                }
                                if(z[0].ContarEs()==5){
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<10;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<8;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[3].setCarros(e1[4].getCarros());
                                    e1[4].setCarros(null);
                                }
                                break;
                                }
                                case 5:{
                                    if(z[0].ContarEs()==5){
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e1[4].setCarros(null);
                                }
                                 break;
                                }
                            }
                            grua.turnLeft();
                            for(int i=0; i<10;i++){
                                grua.move();
                            }
                            for(int i=0; i<3;i++){
                        grua.turnLeft();
                        }
                        grua.move();
                        for(int i=0; i<3;i++){
                            grua.turnLeft();
                        }
                        for(int i=0; i<12;i++){
                            grua.move();
                        }
                        for(int i=0; i<2;i++){
                            grua.turnLeft();
                        }
                        System.out.println("Gracias por su visita, vuelva pronto a "+p.getNombreP());
                        System.out.println("Si desea volver a nuestro menu de opciones escriba true, si por otro lado desea salir escriba false");
                    f=flujoEn.nextBoolean();
                        break;
                            }
                            case 2:{
                                for(int i=0; i<7;i++){
                                grua.move();
                            }
                            for(int i=0; i<3; i++){
                                grua.turnLeft();
                            }
                            switch(p.est(placasalida, zona)){
                                case 1: {
                                    if(z[1].ContarEs()==1){
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[0].setCarros(null);
                                }
                                if(z[1].ContarEs()==2){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[0].setCarros(e2[1].getCarros());
                                    e2[1].setCarros(null);
                                }
                                if(z[1].ContarEs()==3){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[0].setCarros(e2[1].getCarros());
                                    e2[1].setCarros(e2[2].getCarros());
                                    e2[2].setCarros(null);
                                }
                                if(z[1].ContarEs()==4){
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[0].setCarros(e2[1].getCarros());
                                    e2[1].setCarros(e2[2].getCarros());
                                    e2[2].setCarros(e2[3].getCarros());
                                    e2[3].setCarros(null); 
                                }
                                if(z[1].ContarEs()==5){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[0].setCarros(e2[1].getCarros());
                                    e2[1].setCarros(e2[2].getCarros());
                                    e2[2].setCarros(e2[3].getCarros());
                                    e2[3].setCarros(e2[4].getCarros());
                                    e2[5].setCarros(null);
                                }
                                break;
                                }
                                case 2: {
                                    if(z[1].ContarEs()==2){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[1].setCarros(null);
                                }
                                if(z[1].ContarEs()==3){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[1].setCarros(e2[2].getCarros());
                                    e2[2].setCarros(null);
                                }
                                if(z[1].ContarEs()==4){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[1].setCarros(e2[2].getCarros());
                                    e2[2].setCarros(e2[3].getCarros());
                                    e2[3].setCarros(null);
                                }
                                if(z[1].ContarEs()==5){
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[1].setCarros(e2[2].getCarros());
                                    e2[2].setCarros(e2[3].getCarros());
                                    e2[3].setCarros(e2[4].getCarros());
                                    e2[4].setCarros(null); 
                                }
                                break;
                                }
                                case 3:{
                                         if(z[1].ContarEs()==3){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[2].setCarros(null);
                                }
                                if(z[1].ContarEs()==4){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[2].setCarros(e2[3].getCarros());
                                    e2[3].setCarros(null);
                                }
                                if(z[1].ContarEs()==5){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[2].setCarros(e2[3].getCarros());
                                    e2[3].setCarros(e2[4].getCarros());
                                    e2[4].setCarros(null);
                                }
                                break;
                                }
                                case 4:{
                                    if(z[1].ContarEs()==4){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[3].setCarros(null);
                                }
                                if(z[1].ContarEs()==5){
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<7;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[3].setCarros(e2[4].getCarros());
                                    e2[4].setCarros(null);
                                }
                                break;
                                }
                                case 5:{
                                    if(z[1].ContarEs()==5){
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e2[4].setCarros(null);
                                } 
                                  break;  
                                }
                            }
                            grua.turnLeft();
                            for(int i=0; i<10;i++){
                                grua.move();
                            }
                            for(int i=0; i<3;i++){
                        grua.turnLeft();
                        }
                        grua.move();
                        for(int i=0; i<3;i++){
                            grua.turnLeft();
                        }
                        for(int i=0; i<12;i++){
                            grua.move();
                        }
                        for(int i=0; i<2;i++){
                            grua.turnLeft();
                        }
                        System.out.println("Gracias por su visita, vuelva pronto a "+p.getNombreP());
                        System.out.println("Si desea volver a nuestro menu de opciones escriba true, si por otro lado desea salir escriba false");
                    f=flujoEn.nextBoolean();
                        break;

                            }
                            case 3:{
                                for(int i=0; i<4;i++){
                                grua.move();
                            }
                            for(int i=0; i<3; i++){
                                grua.turnLeft();
                            }
                            switch(p.est(placasalida, zona)){
                                case 1:{
                                    if(z[2].ContarEs()==1){
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[0].setCarros(null);
                                }
                                if(z[2].ContarEs()==2){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[0].setCarros(e3[1].getCarros());
                                    e3[1].setCarros(null);
                                }
                                if(z[2].ContarEs()==3){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[0].setCarros(e3[1].getCarros());
                                    e3[1].setCarros(e3[2].getCarros());
                                    e3[2].setCarros(null);
                                }
                                if(z[2].ContarEs()==4){
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[0].setCarros(e3[1].getCarros());
                                    e3[1].setCarros(e3[2].getCarros());
                                    e3[2].setCarros(e3[3].getCarros());
                                    e3[3].setCarros(null); 
                                }
                                if(z[2].ContarEs()==5){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<5;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[0].setCarros(e3[1].getCarros());
                                    e3[1].setCarros(e3[2].getCarros());
                                    e3[2].setCarros(e3[3].getCarros());
                                    e3[3].setCarros(e3[4].getCarros());
                                    e3[5].setCarros(null);
                                }
                                    break;
                                }
                                case 2:{
                                    if(z[2].ContarEs()==2){
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[1].setCarros(null);
                                }
                                if(z[2].ContarEs()==3){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[1].setCarros(e3[2].getCarros());
                                    e3[2].setCarros(null);
                                }
                                if(z[2].ContarEs()==4){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[1].setCarros(e3[2].getCarros());
                                    e3[2].setCarros(e3[3].getCarros());
                                    e3[3].setCarros(null);
                                }
                                if(z[2].ContarEs()==5){
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.pickThing();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                        grua.putThing();
                                    }
                                    
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[1].setCarros(e3[2].getCarros());
                                    e3[2].setCarros(e3[3].getCarros());
                                    e3[3].setCarros(e3[4].getCarros());
                                    e3[4].setCarros(null); 
                                }
                                    break;
                                }
                                case 3:{
                                    if(z[2].ContarEs()==3){
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[2].setCarros(null);
                                }
                                if(z[1].ContarEs()==4){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[2].setCarros(e3[3].getCarros());
                                    e3[3].setCarros(null);
                                }
                                if(z[2].ContarEs()==5){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[2].setCarros(e3[3].getCarros());
                                    e3[3].setCarros(e3[4].getCarros());
                                    e3[4].setCarros(null);
                                }
                                    break;
                                }
                                case 4: {
                                    if(z[2].ContarEs()==4){
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[3].setCarros(null);
                                }
                                if(z[2].ContarEs()==5){
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<12; i++){
                                            grua.move();
                                    }
                                    grua.turnLeft();
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    grua.turnLeft();
                                    for(int i=0; i<4;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    grua.putThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    for(int i=0; i<2;i++){
                                        grua.move();
                                    }
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[3].setCarros(e3[4].getCarros());
                                    e3[4].setCarros(null);
                                }
                                    break;
                                }
                                case 5:{
                                    if(z[2].ContarEs()==5){
                                    grua.move();
                                    grua.pickThing();
                                    for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                    grua.move();
                                    System.out.println("Porfavor digite su hora de salida: ");
                                    horasalida=flujoEn.nextInt();
                                    System.out.println("Por favor pagar: "+p.cobrar(horasalida, placasalida, zona));
                                    total=p.cobrar(horasalida, placasalida, zona)+total;
                                    e3[4].setCarros(null);
                                } 
                                    break;
                                }
                            }
                            grua.turnLeft();
                            for(int i=0; i<10;i++){
                                grua.move();
                            }
                            for(int i=0; i<3;i++){
                        grua.turnLeft();
                        }
                        grua.move();
                        for(int i=0; i<3;i++){
                            grua.turnLeft();
                        }
                        for(int i=0; i<12;i++){
                            grua.move();
                        }
                        for(int i=0; i<2;i++){
                            grua.turnLeft();
                        }
                        System.out.println("Gracias por su visita, vuelva pronto a "+p.getNombreP());
                        System.out.println("Si desea volver a nuestro menu de opciones escriba true, si por otro lado desea salir escriba false");
                    f=flujoEn.nextBoolean();
                        break;
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Bienvenido a la opcion de revisar la ubicacion de su carro, por favor introdusca su clave y la zona donde se encuentra su carro ");
                    int s;
                    String placar;
                    placar=flujoEn.next();
                    String zonar;
                    zonar=flujoEn.next();
                    switch (p.zona(placar,zonar)){
                        case 1:{
                            switch(p.est(placar, zonar)){
                               case 1:{
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<5;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 1 Estacionamiento 1");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   
                                   for(int i=0; i<5;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               }
                               case 2: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 1 Estacionamiento 2");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 3: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 1 Estacionamiento 3");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 4: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<2;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 1 Estacionamiento 4");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<2;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 5: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   System.out.println("Su carro esta en la Zona 1 Estacionamiento 5");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<10;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               }
                           }
                           break;
                        }
                        case 2:{
                            switch(p.est(placar, zonar)){
                               case 1:{
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<5;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 2 Estacionamiento 1");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   
                                   for(int i=0; i<5;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               }
                               case 2: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 2 Estacionamiento 2");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 3: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 2 Estacionamiento 3");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 4: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<2;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 2 Estacionamiento 4");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<2;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 5: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   System.out.println("Su carro esta en la Zona 2 Estacionamiento 5");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<7;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               }
                            }
                            break;
                        }
                        case 3:{
                            switch(p.est(placar, zonar)){
                               case 1:{
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<5;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 3 Estacionamiento 1");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   
                                   for(int i=0; i<5;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               }
                               case 2: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 3 Estacionamiento 2");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 3: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 3 Estacionamiento 3");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<3;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 4: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<2;i++){
                                        grua.move();
                                   }
                                   System.out.println("Su carro esta en la Zona 3 Estacionamiento 4");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<2;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               
                               }
                               case 5: {
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   grua.turnLeft();
                                   grua.move();
                                   grua.turnLeft();
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   System.out.println("Su carro esta en la Zona 3 Estacionamiento 5");
                                   System.out.println("Oprima un numero para seguir");
                                   s=flujoEn.nextInt();
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<1;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<4;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   grua.move();
                                   for(int i=0; i<3;i++){
                                        grua.turnLeft();
                                    }
                                   for(int i=0; i<12;i++){
                                        grua.move();
                                   }
                                   for(int i=0; i<2;i++){
                                        grua.turnLeft();
                                    }
                                   break;
                               }
                           }
                           break;
                    }
                    }   
                        
                    break;
                }
                case 4:{
                    System.out.println("Bienvenido al la opcion de revisar ganancias, las ganancias recolectadas hasta el momento fueron: "+total);
                    break;
                }
                case 5:{
                    f=false;
                    break;
                }
                default:{
                   System.out.println("Opcion no valida intente de nuevo"); 
                }
            }
        }
    }
    
}
