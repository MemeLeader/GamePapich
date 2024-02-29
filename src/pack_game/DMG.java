package pack_game;

import java.util.Scanner;

public class DMG {
    public static void dmg(){
        Scanner sc = new Scanner(System.in);
        Shop d1 = new Shop(500);
        Shop d2 = new Shop(1000);
        Shop d3 = new Shop(2000);
        Shop d4 = new Shop(10000);
        System.out.println("1. Бруд сворд / 500");
        System.out.println("2. Скинхед релик / 1000");
        System.out.println("3. Рапира / 2000");
        System.out.println("4. Дк хук на пуджа / 10000");
        System.out.println("0. Уйти");
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                if(App.Papich.getExp() >= d1.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - d1.getPrice());
                    App.Papich.setDmg(35);
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
                break;
            case 2:
                if(App.Papich.getExp() >= d2.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - d2.getPrice());
                    App.Papich.setDmg(45);
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
                break;
            case 3:
                if(App.Papich.getExp() >= d3.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - d3.getPrice());
                    App.Papich.setDmg(60);
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
            case 4:
                if(App.Papich.getExp() >= d4.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - d4.getPrice());
                    App.Papich.setDmg(80);
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
                break;
            case 0:
                Menu.display();
        }
        Menu.display();
    }
}
