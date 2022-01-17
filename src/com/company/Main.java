package com.company;

public class Main {

    public static void main(String[] args) {
	MyList<Integer> listInterger=new MyList<Integer>();
    listInterger.add(1);
    listInterger.add(2);
    listInterger.add(2);
    listInterger.add(3);
        for (int i = 0; i < 4; i++) {
            System.out.println(listInterger.get(i));
        }
    }
}
