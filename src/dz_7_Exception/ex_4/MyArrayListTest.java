package dz_7_Exception.ex_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList myArrayList = new MyArrayList();
    Object[] person = new Object[]{"Person10", "Person13", "Person14"};

    @BeforeEach
    void init() {
        myArrayList.add("Person1");
        myArrayList.add("Person2");
        myArrayList.add("Person3");
        myArrayList.add("Person4");
        myArrayList.add("Person5");
    }

    @Test
    void add() {
        int initSize = myArrayList.getSize();
        myArrayList.add("SuperPerson");
        int resultSize = myArrayList.getSize();
        assertEquals(initSize + 1, resultSize);
        assertEquals("Person1", myArrayList.getIndex(0));
        assertEquals("Person2", myArrayList.getIndex(1));
        assertEquals("Person3", myArrayList.getIndex(2));
        assertEquals("Person4", myArrayList.getIndex(3));
        assertEquals("Person5", myArrayList.getIndex(4));
    }

    @Test
    void addObject() {
        int initSize = myArrayList.getSize();
        myArrayList.addObject(person);
        int resultSize = myArrayList.getSize();
        assertEquals(initSize + 3, resultSize);
        assertTrue(myArrayList.getSize()==8);
    }
    @Test
    void removeElement() {
        Object e = myArrayList.getIndex(3);
        int initSize = myArrayList.getSize();
        myArrayList.removeElement(2);
        int resultSize = myArrayList.getSize();
        assertEquals(myArrayList.getIndex(2), e);
        assertEquals(initSize - 1, resultSize);
        assertTrue(myArrayList.getSize() == 4);
    }

    @Test
    void removeAll() {
        int initSize = myArrayList.getSize();
        myArrayList.removeAll();
        int resultSize = myArrayList.getSize();
        assertEquals(initSize - 5, resultSize);
    }
}

