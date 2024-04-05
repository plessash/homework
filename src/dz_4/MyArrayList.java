package dz_4;

import java.util.ArrayList;

public class MyArrayList {
    static int capasity = 10;
  static Object[] elements = new Object[capasity];
    private int size = 0;
    public static void main(String[] args){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");
        myArrayList.addElement("Da");

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public void addElement(Object o){
        this.elements[size]=o;
        size++;
        if(size== elements.length){

        }
    }




    }




