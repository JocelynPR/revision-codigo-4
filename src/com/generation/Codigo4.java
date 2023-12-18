package com.generation;

import java.util.Scanner; //Se agrega para poder hacer uso de la clase scanner

public class Codigo4 {
	
	public static void main(String[] args) {
Scanner s = new Scanner(System.in); //Se completa el scanner para poder introducir datos
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): "); //Se completa el print agregandole ln
    String j1 = s.nextLine();
    
    
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //se completa el print y es turno del jugador 2
    String j2 = s.nextLine();
    
    if (j1.equals (j2)) { //ya que no son el mismo objeto no podemos usar "==" en cambio se usa "equals" el cual compara el contenido de dos objetos para verificar si son iguales
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) { //se agrega break en cada caso
        case "piedra":
          if (j2.equals ("tijeras")) { //se cambia a equals
            g = 1;
          } break;

        case "papel":
          if (j2.equals ("piedra")) {
            g = 1;
            
          } break;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
    
	}//ciere main

	
	
	
}
