package funções;

import objetos.Conta;
import objetos.Pessoa;

public class Funcoes {
    public static void gravar(String agencia,String numeroConta,String saldo){
        Conta conta = new Conta();
        conta.setAgencia(agencia);
        conta.setNumeroConta(numeroConta);
        conta.setSaldo(saldo);
    }

    public static void gravar(String nome,String endereco,String telefone,String cpf) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setEndereco(endereco);
        pessoa.setTelefone(telefone);
        pessoa.setCpf(cpf);
    }

    
}
