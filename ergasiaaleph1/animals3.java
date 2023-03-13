package com.unipi.talepis;

//import ArrayList.set;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class animals3 extends JFrame{
    private JPanel zoo;
    private JTextField textField1;
    private JButton EditButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField EditField;

    public animals3() {
        setTitle("EDIT");
        setPreferredSize(new Dimension(1000, 800));
        setContentPane((zoo));
        setDefaultCloseOperation(HIDE_ON_CLOSE); //7.ΕΞΟΔΟΣ ΑΠΟ ΤΗΝ ΕΦΑΡΜΟΓΗ
        pack(); // pack our information
        setLocationRelativeTo(null); //ΕΜΦΑΝΙΖΕΙ ΤΗ ΦΟΡΜΑ ΣΤΗΝ ΟΘΟΝΗ
        setVisible(true);//or faulse

        EditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1 = textField1.getText();
                String t2 = textField2.getText();
                String t3 = textField3.getText();
                String t4 = textField4.getText();
                String t5 = textField5.getText();
                String t6 = EditField.getText();
            }
        });

    }

    public animals3(String data) {
        this();
        EditField.setText(data);
    }
}
