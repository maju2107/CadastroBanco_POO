package componentes;

import javax.swing.*;
import java.awt.*;

public class Separadores {

    private JSeparator jSeparator01;
    private JSeparator jSeparator02;

    public Separadores(){

        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10); 

        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10); 
    }


    public JSeparator getSeparador1 (){
        return jSeparator01;
    }

     public JSeparator getSeparador2 (){
        return jSeparator02;
    }
}