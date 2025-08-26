package funções;

import objetos.*;

public class Funcoes {
    public void gravar(String agencia,String numeroConta,String nome,String endereco,String telefone,String cpf){

        Conta conta = new Conta();
        conta.setAgencia(agencia);
        conta.setNumeroConta(numeroConta);
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setEndereco(endereco);
        pessoa.setTelefone(telefone);
        pessoa.setCpf(cpf);
    }

    
}
