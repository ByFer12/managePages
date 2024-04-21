package com.client.errores;

import java.io.Serializable;

public class Errores implements Serializable {
    private String lexema,tipo,descripcion;
    private int fila,columna;
    public Errores(String lexema, String tipo, String descripcion, int fila, int columna) {
        this.lexema = lexema;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fila = fila;
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFila() {
        return fila;
    }

    @Override
    public String toString() {
        return  lexema +  tipo + descripcion + fila + columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
}
