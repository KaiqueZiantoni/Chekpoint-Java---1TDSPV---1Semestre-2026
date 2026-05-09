package br.com.fiap.chekpoint.model;

public class Locacao {
    private String dataLocacao;
    private String dataDevolucao;
    private Veiculos veiculos;
    private Clientes cliente;
    private boolean status;


//Métodos -----------------------------------------------------------------------------------------

    public boolean alugar() {
        if (this.veiculos != null && this.cliente != null) {
            if (this.veiculos.isDisponibilidade() && !this.cliente.isPossuiOutroAluguel()) {
                this.veiculos.setDisponibilidade(false);
                this.cliente.setPossuiOutroAluguel(true);
                this.status = true;
                return true;
            }
        }

        return false;
        }


    public boolean devolver() {
        if (this.status) {
            this.veiculos.setDisponibilidade(true);
            this.cliente.setPossuiOutroAluguel(false);
            this.status = false;
            return true;
        }
        return false;
    }


//Construtor----------------------------------------------------------------------------------------

    public Locacao(Clientes cliente, Veiculos veiculos ){
        this.cliente = cliente;this.veiculos=veiculos;
    }


// Getters e setters.------------------------------------------------------------------------------

    public String getDataLocacao() {return dataLocacao;}

    public void setDataLocacao(String dataLocacao) {this.dataLocacao = dataLocacao;}

    public String getDataDevolucao() {return dataDevolucao;}

    public void setDataDevolucao(String dataDevolucao) {this.dataDevolucao = dataDevolucao;}

    public Veiculos getVeiculos() {return veiculos;}

    public void setVeiculos(Veiculos veiculos) {this.veiculos = veiculos;}

    public Clientes getCliente() {return cliente;}

    public void setCliente(Clientes cliente) {this.cliente = cliente;}

    public boolean isStatus() {return status;}

    public void setStatus(boolean status) {this.status = status;}
}
