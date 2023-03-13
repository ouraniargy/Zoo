package com.unipi.talepis;

import javax.swing.*;
import java.awt.*;

public class animals2 extends JFrame {
    private JPanel zoo;
    private JLabel label1;

    public animals2() {
        setTitle("ANIMALS");
        setPreferredSize(new Dimension(1000, 800));
        setContentPane((zoo));
        setDefaultCloseOperation(HIDE_ON_CLOSE); //7.ΕΞΟΔΟΣ ΑΠΟ ΤΗΝ ΕΦΑΡΜΟΓΗ
        pack(); // pack our information
        setLocationRelativeTo(null); //ΕΜΦΑΝΙΖΕΙ ΤΗ ΦΟΡΜΑ ΣΤΗΝ ΟΘΟΝΗ
        setVisible(true);//or faulse
    }
    public animals2(String data){
        this();
        label1.setText(data);
    }
}
