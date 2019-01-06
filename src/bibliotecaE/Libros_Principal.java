/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Ernesto
 */
public class Libros_Principal {
    private int idlibro;
    private int Anio_Publi;
    private String Titulo;
    private String Autor;
    private String Genero;
    private String Editorial;
    


public Libros_Principal() {
    }

    public Libros_Principal(int idlibro, int Anio_Publi, String Titulo,String Autor,String Genero,String Editorial) {
        this.idlibro=idlibro;
        this.Anio_Publi = Anio_Publi;
        this.Titulo=Titulo;
        this.Autor=Autor;
        this.Genero=Genero;
        this.Editorial=Editorial;
        
    }

    /**
     * @return the idlibro
     */
    public int getIdlibro() {
        return idlibro;
    }

    /**
     * @param idlibro the idlibro to set
     */
    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    /**
     * @return the Anio_Publi
     */
    public int getAnio_Publi() {
        return Anio_Publi;
    }

    /**
     * @param Anio_Publi the Anio_Publi to set
     */
    public void setAnio_Publi(int Anio_Publi) {
        this.Anio_Publi = Anio_Publi;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the Editorial
     */
    public String getEditorial() {
        return Editorial;
    }

    /**
     * @param Editorial the Editorial to set
     */
    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    

}

