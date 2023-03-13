package com.unipi.talepis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class animals extends JFrame {
    private static Object animal;
    private JLabel zoo1;
    private JButton deserializeButton;
    private JPanel zoo;
    private JButton serializeButton;
    private JTextField ani1;
    private JButton SearchName;
    private JTextField SearchField;
    private JButton goToForm2Button;
    private JButton SearchCode;
    private JTextField SearchField2;
    private JTextField EditField;
    private JButton EditButton;
    private JButton DeleteButton;
    private JButton ExitButton;
    private JTextField Code;
    private JTextField Name;
    private JTextField Weight;
    private JTextField Classis;
    private JTextField AverageMaximumAge;
    private JTextField DeleteField;
    public int pl;
    static List<animal> animalList = new ArrayList<>();

    public animals(Object args) {
        pl=0;
        setTitle("Welcome to our zoo");
        setPreferredSize(new Dimension(1000, 800));
        setContentPane((zoo));
        setDefaultCloseOperation(EXIT_ON_CLOSE); //7.ΕΞΟΔΟΣ ΑΠΟ ΤΗΝ ΕΦΑΡΜΟΓΗ
        pack(); // pack our information
        setLocationRelativeTo(null); //ΕΜΦΑΝΙΖΕΙ ΤΗ ΦΟΡΜΑ ΣΤΗΝ ΟΘΟΝΗ
        setVisible(true);//or faulse
        //ImageIcon image = new ImageIcon("zoo1.jpg");
        //setIconImage(image.getImage());
        File myObj = new File("filename.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        serializeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (pl==0) {
                    animal a1 = new animal("1", "Elephant", "mammal", "4000", "48");
                    animalList.add(a1);
                    animal a2 = new animal("2", "Dolphin", "mammal", "200", "40");
                    animalList.add(a2);
                    animal a3 = new animal("3", "Giraffe", "mammal", "800", "25");
                    animalList.add(a3);
                    animal a4 = new animal("4", "Snake", "reptilian", "800", "25");
                    animalList.add(a4);
                    animal a5 = new animal("5", "Parrot", "bird", "3", "25");
                    animalList.add(a5);
                }
                pl=pl+1;
                animal a6 = new animal(Code.getText(), Name.getText(), Classis.getText(), Weight.getText(), AverageMaximumAge.getText());
                animalList.add(a6);
                mySerialize(animalList, "animals.ser");
            }
        });

        deserializeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<animal> tempList = myDeserialize("animals.ser");
                StringBuilder builder = new StringBuilder();
                for (animal s : tempList) {
                    builder.append("animal:").append(s.code).append(",").append(s.name).append(",").append(s.classis).append(",").append(s.weight).append(",").append(s.averagemaximumage).append("\n");
                }
                JOptionPane.showMessageDialog(animals.this,builder.toString());
            }
        });


        SearchName.addActionListener(new ActionListener() {
            @Override   //annotation
            public void actionPerformed(ActionEvent e) {
                String s = SearchField.getText();
                ReadFile rf = new ReadFile();
                try {
                    rf.MySearch(s);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        goToForm2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new animals2(ani1.getText());
            }
        });
        SearchCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = SearchField2.getText();
                ReadFile rf = new ReadFile();
                try {
                    rf.MySearch(s);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                String word = s;

                Scanner input = new Scanner("animals.ser");

                // Let's loop through each line of the file
                while (input.hasNext()) {
                    String line = input.nextLine();

                    // Now, check if this line contains our keyword. If it does, print the line
                    if (line.contains(word)) {
                        System.out.println(line);
                    }
                }
            }
        });
        EditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new animals3(EditField.getText());
            }
        });
        DeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = DeleteField.getText();
                List<animal> tempList = myDeserialize("animals.ser");
                Scanner scan = new Scanner("animals.ser");
                StringBuilder builder = new StringBuilder();
                int z = 0;
                for (animal a : tempList) {
                    try {
                        com.unipi.talepis.animal element = tempList.get(z);
                        System.out.println(element);
                        z = z + 1;
                        for (animal b : tempList) {
                            if (b.code != s) {
                                builder.append("animal:").append(b.code).append(",").append(b.name).append(",").append(b.classis).append(",").append(b.weight).append(",").append(b.averagemaximumage).append("\n");
                            } else {
                                while (scan.hasNextLine()) {
                                    Scanner input = new Scanner(scan.nextLine());
                                    input.useDelimiter(",");
                                }
                                scan.close();
                            }
                        }
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        });

        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    static void mySerialize(List<animal> animalList, String filename){
        try{
            FileOutputStream f = new FileOutputStream(filename);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(animalList);
            o.close();
            f.close();
            System.out.println("Object has been serialized");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Object has not been serialized");
        }
    }
    static List<animal> myDeserialize (String filename){
        List<animal> animals = new ArrayList<>();
        try{
            FileInputStream f = new FileInputStream(filename);
            ObjectInputStream o = new ObjectInputStream(f);
            animals = (List<animal>)o.readObject();
            o.close();
            f.close();
            System.out.println("Object has been deserialized");
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Object has not been deserialized");
        }
        return animals;
    }
    public class ReadFile
    {
        public void MySearch(String token) throws IOException {
            double count = 0,countBuffer=0,countLine=0;
            String lineNumber = "";
            String filePath = "C:\\Users\\Ourania\\Desktop\\filename.txt";
            BufferedReader br;
            String inputSearch = token;
            String line = "";

            try {
                br = new BufferedReader(new FileReader(filePath));
                try {
                    while((line = br.readLine()) != null)
                    {
                        countLine++;
                        //System.out.println(line);
                        String[] words = line.split(" ");

                        for (String word : words) {
                            if (word.equals(inputSearch)) {
                                count++;
                                countBuffer++;
                            }
                        }

                        if(countBuffer > 0)
                        {
                            countBuffer = 0;
                            lineNumber += countLine + ",";
                        }

                    }
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Times found at--"+count);
            System.out.println("Word found at--"+lineNumber);
            if (count>=1){
                JOptionPane.showMessageDialog(animals.this,"The animal exists in our zoo.");
            } else {
                JOptionPane.showMessageDialog(animals.this,"We are sorry.We don't have this animal.");
            }
        }
    }

}
