/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author l11m02
 */
public class Modelo {

    private int NumeroUno;
    private int NumeroDos;
    private int Resultado;

    public int getNumeroUno() {
        return NumeroUno;
    }

    public void setNumeroUno(int NumeroUno) {
        this.NumeroUno = NumeroUno;
    }

    public int getNumeroDos() {
        return NumeroDos;
    }

    public void setNumeroDos(int NumeroDos) {
        this.NumeroDos = NumeroDos;
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int Resultado) {
        this.Resultado = Resultado;
    }

    

    public int multiplicar() {

        this.Resultado = this.NumeroUno * this.NumeroDos;
        return this.Resultado;

    }

}
