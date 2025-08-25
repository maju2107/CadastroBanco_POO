package componentes;

import javax.swing.*;
import java.awt.*;

public class Botoes {

    // Botões de selecionar tipo de conta
    private JRadioButton jrbCorrente;
    private JRadioButton jrbPoupanca;

    private ButtonGroup bgContas;

    // Botões de selecionar operações
    private JButton jbConsultar;
    private JButton jbAtualizar;
    private JButton jbFechar;
    
    public Botoes (){
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 113, 20);
        jrbCorrente.setSelected(true);
        jrbCorrente.setMnemonic('C');

        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic('P');

        bgContas = new ButtonGroup();

        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic('S');

        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(140, 190, 100, 23);
        jbAtualizar.setMnemonic('A');
        jbAtualizar.setEnabled(false);

        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(245, 190, 100, 23);
        jbFechar.setMnemonic('F');

    }

    public JRadioButton getBotaoContaCorrente(){
        return jrbCorrente;
    }

    public JRadioButton getBotaoContaPoupanca(){
        return jrbPoupanca;
    }

    public JButton getBotaoConsultar(){
        return jbConsultar;
    }

    public JButton getBotaoAtualizar(){
        return jbAtualizar;
    }

    public JButton getBotaoFechar(){
        return jbFechar;
    }

}