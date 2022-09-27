package org.example;

public class Main {
    public static void main(String[] args) {
        Warrior solid = new Warrior(2,3,0, false);

        solid.ifDead();

        oddList(3);
    }
    public static int[] oddList(int num) {
//        List<Integer> oddList = new List<Integer>;
//         ArrayList<Object> oddList = new ArrayList<>();
        int[] oddList;
        int counter = 0;

        if (num % 2 == 0) {
            oddList = new int[num / 2];
        } else {
            oddList = new int[num / 2 + 1];
        }
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                oddList[counter] = i;
                counter++;
                System.out.println(i);
            }
        }
        return oddList;
    }
}