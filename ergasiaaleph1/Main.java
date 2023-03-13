package com.unipi.talepis;

import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        new animals(args);
        System.out.println("Welcome to our zoo");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to get information about the animals");
        System.out.println("1 = Elephant");
        System.out.println("2 = Dolphin");
        System.out.println("3 = Giraffe");
        System.out.println("4 = Snake");
        System.out.println("5 = Parrot");
        int animal = scan.nextInt();
        if (animal==1) {
            System.out.println("Elephant, (family Elephantidae), largest living land animal,characterized by its long trunk (elongated upper lip and nose)' ");
            System.out.println("columnar legs, and huge head with temporal glands and wide, flat ears.Elephants are grayish to brown in colour, and their body hair is sparse and coarse. ");
            System.out.println("");
            elephant el1 = new elephant();
            elephant el2 = new elephant();
            elephant el3 = new elephant();
            printel1name();
            printel2name();
            printel3name();
            el1.weight = 507.4;
            el2.weight = 392.1;
            el3.weight = 482.6;
            el1.age = 3;
            el2.age = 7;
            el3.age = 6;
            el1.sex = "female";
            el2.sex = "male";
            el3.sex = "female";
            System.out.println("");
            System.out.println("First elephant is " + el1.weight + " kgs,it is " + el1.age + " years old and it is a " + el1.sex);
            System.out.println("Second elephant is " + el2.weight + " kgs,it is " + el2.age + " years old and it is a " + el2.sex);
            System.out.println("Third elephant is " + el3.weight + " kgs,it is " + el3.age + " years old and it is a " + el3.sex);
        } else if (animal==2){
            System.out.println("Dolphin is a common name of aquatic mammals within the infraorder Cetacea.");
            System.out.println("The term dolphin usually refers to the extant families Delphinidae (the oceanic dolphins), Platanistidae (the Indian river dolphins),");
            System.out.println("Iniidae (the New World river dolphins), and Pontoporiidae (the brackish dolphins), and the extinct Lipotidae (baiji or Chinese river dolphin).");
            System.out.println("There are 40 extant species named as dolphins.");
            System.out.println("");
            dolphin dol1 = new dolphin();
            dolphin dol2 = new dolphin();
            dolphin dol3 = new dolphin();
            printdol1age();
            printdol2age();
            printdol3age();
            dol1.weight = 53;
            dol2.weight = 34;
            dol3.weight = 15;
            dol1.name = "Marilia";
            dol2.name = "Nikos";
            dol3.name = "Katia";
            dol1.sex = "female";
            dol2.sex = "male";
            dol3.sex = "female";
            dol1.speed = 53;
            dol2.speed = 34;
            dol3.speed = 15;
            dol1.sex = "grey";
            dol2.sex = "black";
            dol3.sex = "white";
            System.out.println("");
            System.out.println("First dolphin's name is " + dol1.name + " it is " + dol1.weight + " kgs,it is a " + dol1.sex +" its speed is "+dol1.speed+"/h andits color is "+dol1.color);
            System.out.println("Second dolphin's name is " + dol2.name + " it is " + dol2.weight + " kgs,it is a " + dol2.sex +" its speed is "+dol2.speed+"/h andits color is "+dol2.color);
            System.out.println("Third dolphin's name is " + dol3.name + " it is " + dol3.weight + " kgs,it is a " + dol3.sex +" its speed is "+dol3.speed+"/h andits color is "+dol3.color);
        } else if(animal==3){
            System.out.println("The giraffe (Giraffa) is an African artiodactyl mammal, the tallest living terrestrial animal and the largest ruminant.");
            System.out.println("It is traditionally considered to be one species, Giraffa camelopardalis, with nine subspecies.");
            System.out.println("However, the existence of up to eight extant giraffe species has been described, based upon research into the mitochondrial and nuclear DNA, as well as morphological measurements of Giraffa.");
            System.out.println("Seven other species are extinct, prehistoric species known from fossils.");
            System.out.println("");
            giraffe gir1 = new giraffe();
            giraffe gir2 = new giraffe();
            printgir1do();
            printgir2do();
            gir1.name = "Layla";
            gir2.name = "Taxiarhis";
            gir1.age = 24;
            gir2.age = 12;
            gir1.color = "yellow";
            gir2.color = "orange";
            gir1.height = 17.2;
            gir2.height = 52;
            gir1.sex = "female";
            gir2.sex = "male";
            System.out.println("");
            System.out.println("First giraffe's name is "+gir1.name+",it is "+gir1.age+" years old,it has "+gir1.color+",it is "+gir1.height+" meters and its ssex is "+gir1.sex);
            System.out.println("Second giraffe's name is "+gir2.name+",it is "+gir2.age+" years old,it has "+gir2.color+",it is "+gir2.height+" meters and its ssex is "+gir2.sex);
        } else if(animal==4){
            System.out.println("Snakes are elongated, limbless, carnivorous reptiles of the suborder Serpentes.");
            System.out.println("Like all other squamates, snakes are ectothermic, amniote vertebrates covered in overlapping scales.");
            System.out.println("Many species of snakes have skulls with several more joints than their lizard ancestors, enabling them to swallow prey much larger than their heads with their highly mobile jaws.");
            System.out.println("To accommodate their narrow bodies, snakes' paired organs (such as kidneys) appear one in front of the other instead of side by side, and most have only one functional lung.");
            System.out.println("Some species retain a pelvic girdle with a pair of vestigial claws on either side of the cloaca.");
            System.out.println("Lizards have evolved elongate bodies without limbs or with greatly reduced limbs about twenty-five times independently via convergent evolution, leading to many lineages of legless lizards.");
            System.out.println("These resemble snakes, but several common groups of legless lizards have eyelids and external ears, which snakes lack, although this rule is not universal (see Amphisbaenia, Dibamidae, and Pygopodidae).");
            System.out.println("");
            snake sn1 = new snake();
            sn1.size = 53.2;
            System.out.print("Snake 1:");
            sn1.sleep();
            System.out.println("Its size is "+sn1.size);
            System.out.println("Its color is "+sn1.color1+" and its weight is "+sn1.weight1+" kgs");
            snake sn2 = new snake();
            sn2.size = 53.2;
            System.out.print("Snake 2:");
            sn2.play();
            System.out.println("Its size is "+sn2.size);
            System.out.println("Its color is "+sn2.color2+" and its weight is "+sn2.weight2+" kgs");
            snake sn3 = new snake();
            sn3.size = 53.2;
            System.out.print("Snake 3:");
            sn3.play();
            System.out.println("Its size is "+sn3.size);
            System.out.println("Its color is "+sn3.color3+" and its weight is "+sn3.weight3+" kgs");
        } else if(animal==5){
            System.out.println("Parrots, also known as psittacines are birds of the roughly 398 species in 92 genera comprising the order Psittaciformes , found mostly in tropical and subtropical regions.");
            System.out.println("The order is subdivided into three superfamilies: the Psittacoidea (\"true\" parrots), the Cacatuoidea (cockatoos), and the Strigopoidea (New Zealand parrots).");
            System.out.println("Parrots have a generally pantropical distribution with several species inhabiting temperate regions in the Southern Hemisphere, as well.");
            System.out.println("The greatest diversity of parrots is in South America and Australasia.");
            parrot p1 = new parrot();
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Please give us a name");
            String name = scan1.nextLine();
            p1.sayHi(name);
        }
    }
    public static void printel1name() {
        System.out.println("1)Elephant's name is Korina");
    }
    public static void printel2name() {
        System.out.println("2)Elephant's name is Jason");
    }
    public static void printel3name() {
        System.out.println("3)Elephant's name is Blair");
    }
    public static void printdol1age() {
        System.out.println("1)Dolphin is 10 years old");
    }
    public static void printdol2age() {
        System.out.println("2)Dolphin is 5 years old");
    }
    public static void printdol3age() {
        System.out.println("3)Dolphin is 3 years old");
    }
    public static void printgir1do() {
        System.out.println("She is eating leaves right now.");
    }
    public static void printgir2do() {
        System.out.println("He is sleeping right now.");
    }
}
