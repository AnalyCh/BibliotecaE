/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import biblioteca.Conexion;
import biblioteca.Libros_Principal;


import java.util.ArrayList;

/**
 *
 * @author Ernesto
 */
public class LibrosDB {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    //Codigo para listar los libros
    public ArrayList<Libros_Principal> listarLibros() {
        ArrayList<Libros_Principal> libros = new ArrayList<>();
        try {
            conn = Conexion.Conectar();
            //cnx = ConexionDB.getConneccion();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT  idlibro,Titulo,Autor,Anio_Publi,Genero,Editorial"
                    + " FROM libro ORDER BY 2 ");
            while (rs.next()) {
               Libros_Principal l = new Libros_Principal();
               l.setIdlibro(rs.getInt(1));
               l.setTitulo(rs.getString(2));
               l.setAutor(rs.getString(3));
               l.setAnio_Publi(rs.getInt(4));
               l.setGenero(rs.getString(5));
               l.setEditorial(rs.getString(6));
               
               libros.add(l);
              
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error en listado");
        }
        return libros;
    }

}
