package componentes;

import javax.swing.*;

public class CamposAgencia {

    // Campo do Código da Agência
    private JLabel jlAgencia;
    private JTextField jtfAgencia;

    // Campo do Número da Conta
    private JLabel jlConta;
    private JTextField jtfConta;

    public CamposAgencia() {

        jlAgencia = new JLabel();
        jlAgencia.setText("Código da Agência:");
        jlAgencia.setBounds(10,10,110,18);

        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125,10,50,20);

        jlConta = new JLabel();
        jlConta.setText("Número da Conta:");
        jlConta.setBounds(205,10, 105,18);
        
        jtfConta = new JTextField();
        jtfConta.setBounds(315,10,60,20);

    }

    public JLabel getLabelAgencia(){
        return jlAgencia;
    }

    public JTextField getCampoAgencia(){
        return jtfAgencia;
    }

    public JLabel getLabelConta(){
        return jlConta;
    }

    public JTextField getCampoConta(){
        return jtfConta;
    }


}