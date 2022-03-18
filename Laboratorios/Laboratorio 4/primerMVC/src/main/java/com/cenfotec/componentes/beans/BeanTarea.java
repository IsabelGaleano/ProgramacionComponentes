package com.cenfotec.componentes.beans;

public class BeanTarea {
    private int numero;
    private String resultado;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    public String getGetFactorial() {
        int iFactorial = 1;

        this.resultado = Integer.toString(this.numero) + "! = 1";

        for (int x = 2; x <= this.numero; x++) {
            iFactorial = iFactorial * x;
            resultado = resultado + " x " + Integer.toString(x);
        }

        return resultado + " = " + Integer.toString(iFactorial);
    }
}
