package br.com.fiap.chekpoint.model;

public class Clientes {
    private String nome;
    private String cpf;
    private String telefone;
    private int carteiraMotorista;
    private int idade;
    private boolean possuiOutroAluguel;


//Construtor ------------------------------------------------------------------------------------------------------------------
    public Clientes(String nomeCliente,  String telefoneCliente, int cnh, int oficialAge){
        this.nome = nomeCliente;this.telefone = telefoneCliente;this.carteiraMotorista = cnh;this.idade = oficialAge;

        this.possuiOutroAluguel = false;
    }



//Métodos-----------------------------------------------------------------------------------------------------------------------
    private void registrarCliente() {
    }

    private String bloquerCliente() {return nome + cpf;}


//Getters e setters ------------------------------------------------------------------------------------------------------------

    public boolean isPossuiOutroAluguel() {
        return possuiOutroAluguel;
    }

    public void setPossuiOutroAluguel(boolean possuiOutroAluguel) {
        this.possuiOutroAluguel = possuiOutroAluguel;
    }


    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public int getCarteiraMotorista() {return carteiraMotorista;}

    public void setCarteiraMotorista(int carteiraMotorista) {this.carteiraMotorista = carteiraMotorista;}

    public int getIdade() {return idade;}

    public void setIdade(short idade) {this.idade = idade;}
}
