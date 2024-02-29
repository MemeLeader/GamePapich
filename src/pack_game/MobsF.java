package pack_game;

import java.util.Random;
import java.util.Scanner;

public class MobsF {

    public static void mobsf(){
        Scanner sc = new Scanner(System.in);
        Mobs[] mobsArray = new Mobs[4];
        mobsArray[0] = new Mobs("Рофлан", 55, 15, 100);
        mobsArray[1] = new Mobs("Лесник 5 поз", 30, 55, 125);
        mobsArray[2] = new Mobs("Пудж пятерка", 500, 2, 400);
        mobsArray[3] = new Mobs("Курьер рофлов", 1, 0, 700);
        Random r = new Random();
        int maxK = 3;
        int minK = 0;
        int mobR = r.nextInt(maxK - minK + 1) + minK;
        while(mobsArray[mobR].getHp() > 0) {
            System.out.println("/////////////////////////////////////////////");
            System.out.println("На вас напал: " + mobsArray[mobR].getName());
            Attack.attack();
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Вы атаковали мечем");
                    mobsArray[mobR].setHp(mobsArray[mobR].getHp() - App.Papich.getDmg());
                    System.out.println("Здоровье моба: " + mobsArray[mobR].getHp());
                    break;
                case 2:
                    if(App.Papich.getMana() > 0) {
                        System.out.println("Вы атаковали с помощью " + App.Papich.getSkill());
                        mobsArray[mobR].setHp(mobsArray[mobR].getHp() - App.Papich.getSkillDmg());
                        App.Papich.setMana(App.Papich.getMana() - App.Papich.getManaCost());
                        System.out.println("Здоровье моба: " + mobsArray[mobR].getHp());
                        App.Papich.setMana(App.Papich.getMana() - App.Papich.getManaCost());
                    }else{
                        System.out.println("У вас недостаточно маны...");
                    }
                    break;
                case 0:
                    System.out.println("позорище...");
                    System.exit(0);
            }
            if(mobsArray[mobR].getHp() > 0){
                System.out.println(mobsArray[mobR].getName() + " вас атаковал, он нанес вам: " + mobsArray[mobR].getDmg());
                App.Papich.setHp(App.Papich.getHp() - mobsArray[mobR].getDmg());
            }
        }
        App.Papich.setExp(App.Papich.getExp() + mobsArray[mobR].getExp());
        System.out.println("Вы востановили немного маны ");
        App.Papich.setMana(App.Papich.getMana() + 10);
        System.out.println("Поздравляю вы победили " + mobsArray[mobR].getName() + "(осталось до Босса " + (5 - GameF.count) + ")");
        System.out.println("Вы получили " + mobsArray[mobR].getExp() + " опыта");
        Menu.display();
    }
}
