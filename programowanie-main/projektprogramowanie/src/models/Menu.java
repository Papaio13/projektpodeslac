package models;

import interfaces.BasicInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu extends ArrayList implements BasicInterface {
    private ArrayList<String> listmenu=new ArrayList<String>();

    public Menu(){
        this.initialize();
    }

    public String getDish(int zmienna) {
        return this.listmenu.get(zmienna);
    }

    private void initialize(){
        listmenu.add("Spaghetti bolognese(0)");
        listmenu.add("Spaghetti carbonara(1)");
        listmenu.add("Lasagne bolognese(2)");
        listmenu.add("Ravioli ze szpinakiem(3)");
        listmenu.add("Macaroni & cheese(4)");
        listmenu.add("Gnocchi w sosie pomidorowym(5)");
        listmenu.add("Tagliatelle z kurczakiem w sosie smietanowym(6)");
        listmenu.add("Aby wyczyścić liste - 7");
        listmenu.add("Aby przejsc dalej - 8");
        listmenu.add("Aby dodać do koszyka danie nacisnij odpowiadajacy mu numerek");
    }

    public void printmenu(){
        System.out.println(WITAJ+"\nMenu:");
        for (int i=0;i<10;i++) {
            System.out.println(listmenu.get(i));
        }
    }
}
