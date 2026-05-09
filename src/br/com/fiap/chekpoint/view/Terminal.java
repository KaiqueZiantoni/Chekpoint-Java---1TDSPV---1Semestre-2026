package br.com.fiap.chekpoint.view;
import br.com.fiap.chekpoint.model.Clientes;
import br.com.fiap.chekpoint.model.Locacao;
import br.com.fiap.chekpoint.model.Veiculos;
import javax.swing.*;

public class Terminal {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo, a seguir teremos algumas perguntas para te conhecer melhor");
        String nomeCliente = JOptionPane.showInputDialog("Digite seu nome: ");
        String ageQuestion = JOptionPane.showInputDialog("Digite sua idade: ");
        String telefoneCliente = JOptionPane.showInputDialog("Digite seu numero de telefone: ");
        int oficialAge = Integer.parseInt(ageQuestion);
        int cnh = JOptionPane.showConfirmDialog(null, "Você possui carteira de motorista válida: ");

//CLIENTES ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Clientes cliente = new Clientes(nomeCliente, telefoneCliente, cnh, oficialAge);
        JOptionPane.showMessageDialog(null, "Cadastro de " + cliente.getNome() + " criado com sucesso.");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String[] opcoesCarro = {"Celta", "Ford Ka", "Range Rover", "Virtus"};

       String carroEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha o veiculo que deseja alugar: ", "Tabela de veiculos", JOptionPane.QUESTION_MESSAGE,null,opcoesCarro, opcoesCarro[0]);
        if(carroEscolhido != null) {
            String placaDoCarro = "";
            int kmEscolhido = 0;

            switch (carroEscolhido) {
                case "Celta":
                    placaDoCarro = "ABC-1234";
                    kmEscolhido = 68000;
                    break;
                case "Ford Ka":
                    placaDoCarro = "DEF-5678";
                    kmEscolhido = 76560;
                    break;

                case "Virtus":
                    placaDoCarro = "GHI-8890";
                    kmEscolhido= 34000;
                    break;
                case "Range Rover":
                    placaDoCarro = "JKL--9889";
                    kmEscolhido = 112000;
                    break;
            }

//VEICULOS -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            Veiculos carro = new Veiculos(carroEscolhido, placaDoCarro, kmEscolhido);
//LOCAÇÃO____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
            Locacao locacao = new Locacao(cliente,carro);
            locacao.setCliente(cliente);
            locacao.setVeiculos(carro);

            if (locacao.alugar()){
                JOptionPane.showMessageDialog(null, "Locação aprovada com sucesso!! \n" + "\n Locatário: " + cliente.getNome() + "\nVeículo: "+ carro.getModelo() + " Placa: " + carro.getPlaca());
            }else {
                JOptionPane.showMessageDialog(null, "Locação negada. Verifique as pendências.");
            }



    }
    }
}
