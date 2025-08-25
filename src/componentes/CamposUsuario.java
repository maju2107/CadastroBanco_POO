package componentes;

import javax.swing.*;
import java.awt.*;

public class CamposUsuario {

    // Campo Nome
    private JLabel jlNome;
    private JTextField jtfNome;
    
    // Campo Endereço
    private JLabel jlEndereco;
    private JTextField jtfEndereco;

    // Campo Telefone
    private JLabel jlTelefone;
    private JTextField jtfTelefone;

    // Campo Cpf
    private JLabel jlCpf;
    private JTextField jtfCpf;

    public CamposUsuario(){
        jlNome = new JLabel();
        jlNome.setText("Nome:");
        jlNome.setBounds(10,50,60,18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);

        jtfNome = new JTextField();
        jtfNome.setBounds(75,50,300,20);

        jlEndereco = new JLabel();
        jlEndereco.setText("Endereço");
        jlEndereco.setBounds(10,75, 60,18);
        
        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75,75,300,20);

        jlTelefone = new JLabel();
        jlTelefone.setText("Telefone:");
        jlTelefone.setBounds(10,100,60,18);

        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75,100,300,20);

        jlCpf = new JLabel();
        jlCpf.setText("CPF:");
        jlCpf.setBounds(10,125, 60,18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        
        jtfCpf = new JTextField();
        jtfCpf.setBounds(75,125,300,20);

    }

    public JLabel getLabelNome(){
        return jlNome;
    }

    public JTextField getCampoNome(){
        return jtfNome;
    }

    public JLabel getLabelEndereco(){
        return jlEndereco;
    }

    public JTextField getCampoEndereco(){
        return jtfEndereco;
    }

    public JLabel getLabelTelefone(){
        return jlTelefone;
    }

    public JTextField getCampoTelefone(){
        return jtfTelefone;
    }

    public JLabel getLabelCpf(){
        return jlCpf;
    }

    public JTextField getCampoCpf(){
        return jtfCpf;
    }


}