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
public class Tesis extends Escrito{
    
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String idea, String[] argumentos, String conclusion, String referencias, String interpretacion, String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    public int palabrasTotales (int num) {
        return getPaginas() * num * 5;
    }
    
    public String interpretacion () {
        return getInterpretacion();
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + 
               getTitulo() + "\n" + 
               getAutor() + "\n" + 
               getPaginas() + "\n" +
               getIdea() + "\n" + 
               argumentos.length + "\n" + 
               getConclusion() + "\n" + 
               getReferencias();
    }
      
}