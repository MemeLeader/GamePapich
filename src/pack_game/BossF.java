package pack_game;

import java.util.Random;
import java.util.Scanner;

public class BossF {
    public static void bossf() {
        Scanner sc = new Scanner(System.in);
        Boss[] bossArray = new Boss[3];
        bossArray[0] = new Boss("Богдан", 410, 55, 600, "Ключ на 13", 100);
        bossArray[1] = new Boss("Саня Кинг", 500, 35, 600, "Плевок в харю", 40);
        bossArray[2] = new Boss("Расфиженный керри", 300, 250, 600, "вертушка", 500);
        Random r = new Random();
        int maxK = 2;
        int minK = 0;
        int mobR = r.nextInt(maxK - minK + 1) + minK;
            while (bossArray[mobR].getHp() > 0) {
                System.out.println("/////////////////////////////////////////////");
                System.out.println("На вас напал: " + bossArray[mobR].getName());
                Attack.attack();
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Вы атаковали мечем");
                        bossArray[mobR].setHp(bossArray[mobR].getHp() - App.Papich.getDmg());
                        System.out.println("Здоровье моба: " + bossArray[mobR].getHp());
                        break;
                    case 2:
                        if (App.Papich.getMana() > 0) {
                            System.out.println("Вы атаковали с помощью " + App.Papich.getSkill());
                            bossArray[mobR].setHp(bossArray[mobR].getHp() - App.Papich.getSkillDmg());
                            App.Papich.setMana(App.Papich.getMana() - App.Papich.getManaCost());
                            System.out.println("Здоровье моба: " + bossArray[mobR].getHp());
                            App.Papich.setMana(App.Papich.getMana() - App.Papich.getManaCost());
                        } else {
                            System.out.println("У вас недостаточно маны...");
                        }
                        break;
                    case 0:
                        System.out.println("позорище...");
                        System.exit(0);
                }
                if (bossArray[mobR].getHp() > 0) {
                    System.out.println(bossArray[mobR].getName() + " вас атаковал, он нанес вам: " + bossArray[mobR].getDmg());
                    App.Papich.setHp(App.Papich.getHp() - bossArray[mobR].getDmg());
                }
            }
            App.Papich.setExp(App.Papich.getExp() + bossArray[mobR].getExp());
            System.out.println("Вы востановили немного маны ");
            App.Papich.setMana(App.Papich.getMana() + 10);
            System.out.println("Поздравляю вы победили " + bossArray[mobR].getName());
            System.out.println("Вы получили " + bossArray[mobR].getExp() + " опыта");
            Menu.display();

    }
}
