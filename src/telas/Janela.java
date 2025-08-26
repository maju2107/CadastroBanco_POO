package telas;
import componentes.*;


import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import funções.*;

public class Janela extends JFrame{
    
    private void centralizar(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height) 
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width) / 2,
                    (screen.height - janela.height) /2);
       
    }

    public Janela(){
        super("Java Swing - Desenvolvimento de Sistemas");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null); // evitar que o usuário redimensione a janela

        centralizar();

        CamposAgencia campo1 = new CamposAgencia();
        Separadores separador = new Separadores();
        CamposUsuario campo2 = new CamposUsuario();
        Botoes botao = new Botoes();
        

        getContentPane().add(campo1.getLabelAgencia());
        getContentPane().add(campo1.getCampoAgencia());
        getContentPane().add(campo1.getLabelConta());
        getContentPane().add(campo1.getCampoConta());

        getContentPane().add(separador.getSeparador1());

        getContentPane().add(campo2.getLabelNome());
        getContentPane().add(campo2.getCampoNome());
        getContentPane().add(campo2.getLabelEndereco());
        getContentPane().add(campo2.getCampoEndereco());
        getContentPane().add(campo2.getLabelTelefone());
        getContentPane().add(campo2.getCampoTelefone());
        getContentPane().add(campo2.getLabelCpf());
        getContentPane().add(campo2.getCampoCpf());

        getContentPane().add(botao.getBotaoContaCorrente());
        getContentPane().add(botao.getBotaoContaPoupanca());

        getContentPane().add(separador.getSeparador2());

        getContentPane().add(botao.getBotaoConsultar());
        getContentPane().add(botao.getBotaoAtualizar());
        getContentPane().add(botao.getBotaoGravar());

        botao.getBotaoGravar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String agencia = campo1.getCampoAgencia().getText().trim();
                String numeroConta = campo1.getCampoConta().getText().trim();

                String nome = campo2.getCampoNome().getText().trim();
                String endereco = campo2.getCampoEndereco().getText().trim();
                String telefone = campo2.getCampoTelefone().getText().trim();
                String cpf = campo2.getCampoCpf().getText().trim();

                Funcoes funcao = new Funcoes();

                if (agencia.isEmpty()|| numeroConta.isEmpty()|| nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || cpf.isEmpty()) {
                   JOptionPane.showMessageDialog(rootPane, "Todos os campos prescisam estar preenchidos");
                } else {
                    funcao.gravar(agencia,numeroConta,nome,endereco,telefone,cpf);
                    System.out.println("Botão gravar clicado");
                }

                
            }
        });

    }

}
