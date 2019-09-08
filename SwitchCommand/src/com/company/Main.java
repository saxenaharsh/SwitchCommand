package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 4;

        switch(switchValue){
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5");
                break;
            default:
                System.out.println("Value is neither 1 or 2");
                break;
        }
    }
}
