package com.ocean.demo;

public class TestLoop {
    public static void main(String[] args) {
        int size = 0;
        for (int i=0; i < 16; i++) {
            int j = 0;
            for (;j<size;j++) {
                /*if (j == 0){
                    break;
                }*/
            }
            System.out.println("j = " + j);
            if (j == 0 || j == size) {
                size++;
            }
        }
        System.out.println("size = " + size);
    }
}
