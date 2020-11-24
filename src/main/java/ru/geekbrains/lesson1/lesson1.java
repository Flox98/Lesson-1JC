package ru.geekbrains.lesson1;

import java.util.Random;

public class lesson1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Deistvie[] deistvies = new Deistvie[3];
        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        deistvies[0] = new Human("Джон", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        deistvies[1] = new Robot("Киборг", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        deistvies[2] = new Cat("Барсик", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Дорожка " + i, distance);
            } else {
                barriers[i] = new Wall("Ходьба " + i, distance);
            }
        }

        for (int i = 0; i < deistvies.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(deistvies[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успешно");
            } else {
                System.out.println("Неуспешно");
            }
        }
    }
}
