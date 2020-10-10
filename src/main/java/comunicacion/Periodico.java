/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion;

/**
 *
 * @author Manuel
 */
public class Periodico extends Escrito{
    
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    public int palabrasTotales (int num) {
        return getPaginas() * num * 10;
    }
    
    public String interpretacion () {
        return getInterpretacion();
    }

    @Override
    public String toString() {
        return getOrigen()+"\n"+
               getTitulo()+"\n"+
               getAutor()+"\n"+
               getPaginas()+"\n"+
               getFecha()+"\n"+
               getPrimicia();
    }
     
}
