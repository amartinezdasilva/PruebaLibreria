/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package probandolibreria;

import proyectolibreria.ProyectoLibreria;

public class ProbandoLibreria {

   
    public static void main(String[] args) {
        ProyectoLibreria l = new ProyectoLibreria();
        l.Conectar("jdbc:mysql://localhost","futbol", "root","pedrapedra6");
        l.Insertar("jugador", "idjugador,nombre,dorsal,posicion,goles,asistencias,partidosjugados", "10,'Jota',11,'delantero',100,200,1000");
       //l.Borrar("jugador","idjugador",10);
       // l.Actualizar("jugador", "nombre,dorsal", "Jota,17", "idjugador", 10);
    }
    
}
