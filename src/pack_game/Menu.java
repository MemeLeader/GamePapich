package pack_game;

import java.util.Scanner;

public class Menu {


    public static void display() {
    Scanner sc = new Scanner(System.in);
    Choise.choice();
      int menu = sc.nextInt();
        switch (menu) {
            case 1:
                GameF.GameF();
                break;
            case 2:
                Shop.magaz();
                break;
            case 3:
                HeroStats.hs();
                break;
            case 0:
                System.exit(0);
                break;

        }


    }
}

