package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,0);
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.

            
            
            
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = estudiante.canPickThing();
            
            for(int i=0; i<4; i++){
            estudiante.move();
            //Tomar un Thing
            while(puedeTomar==true){
            //if(puedeTomar == true)
               estudiante.pickThing();
            }
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = estudiante.countThingsInBackpack();
            
            //estudiante.pickThing();
            

            //Poner Thing, se debe validar que tenga things en el bolso
            //estudiante.putThing();
            estudiante.turnLeft();
            //Número de pasos que Karel da plantando
            int pasos = 0;
            while(numeroThings>0){
                estudiante.move();
                estudiante.putThing();
                pasos++;
            }
            creacionFuncion2(2);
            while(pasos>0){
                estudiante.move();
                pasos--;
            }
            estudiante.turnLeft();
        }
                       
            //Si el frente esta libre de Wall
            //estudiante.frontIsClear();
            
            //Invocando una funcion
            //creacionFuncion(4);
            
            //Toman un Thing
            //estudiante.pickThing();
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
        public static void creacionFuncion2(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.turnLeft();
        }
}

