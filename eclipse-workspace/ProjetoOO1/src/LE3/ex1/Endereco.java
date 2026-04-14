package LE3.ex1;

import java.time.LocalDate; // Importe a classe LocalDate para representar a data
import java.time.format.DateTimeFormatter; // Importe para formatar a data

public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + ", Número: " + numero + ", Bairro: " + bairro + ", Cidade: " + cidade + ", Estado: " + estado;
    }
}