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
public class Fabula extends Escrito{
    
    private String ensenanza;
    private String interpretacion;

    public Fabula(String ensenanza, String interpretacion, String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    public int palabrasTotales (int num) {
        return getPaginas() * num;
    }
    
    public String interpretacion () {
        return getInterpretacion();
    }

    @Override
    public String toString() {
        return getOrigen()+ "\n"+
               getTitulo()+ "\n"+
               getAutor()+ "\n"+
               getPaginas()+ "\n"+
               getEnsenanza()
               ;
    }
      
}
