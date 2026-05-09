package br.com.fiap.chekpoint.model;

public class Veiculos {
    private String modelo;
    private String placa;
    private int kmAtual;
    private boolean disponibilidade;


//Métodos --------------------------------------------------------------------------------------------------------------

    public  String cadastrarVeiculos() {
        return cadastrarVeiculos();
    }
    boolean verificarDisponibilidade(){
        return disponibilidade;
    }


//Construtor------------------------------------------------------------------------------------------------------------

    public Veiculos(String carroEscolhido, String placaDoCarro, int kmEscolhido) {
        this.modelo = carroEscolhido;
        this.kmAtual = kmEscolhido;
        this.placa = placaDoCarro;
        this.disponibilidade = true;
    }

//Getters e setters-----------------------------------------------------------------------------------------------------
    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getPlaca() {return placa;}

    public String setPlaca(String placa) {this.placa = placa;
        return placa;
    }

    public int getKmAtual() {return kmAtual;}

    public void setKmAtual(int kmAtual) {this.kmAtual = kmAtual;}

    public boolean isDisponibilidade() {return disponibilidade;}

    public void setDisponibilidade(boolean disponibilidade) {this.disponibilidade = disponibilidade;}
}
