package pack_game;

import java.util.Scanner;

public class Hp {
    public static void  hp(){
        Scanner sc = new Scanner(System.in);
        Shop k1 = new Shop(500);
        Shop k2 = new Shop(1000);
        Shop k3 = new Shop(2000);
        Shop k4 = new Shop(10000);
        System.out.println("1. маленький камень здоровья / 500");
        System.out.println("2. Средний камень здоровья / 1000");
        System.out.println("3. Большой камень здоровья / 2000");
        System.out.println("4. Легендарный камень здоровья / 10000");
        System.out.println("0. Уйти");
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                if(App.Papich.getExp() >= k1.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - k1.getPrice());
                    App.Papich.setHp(350);
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
                break;
            case 2:
                if(App.Papich.getExp() >= k2.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - k2.getPrice());
                    App.Papich.setHp(420);
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
                break;
            case 3:
                if(App.Papich.getExp() >= k3.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - k3.getPrice());
                    App.Papich.setHp(520);
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
            case 4:
                if(App.Papich.getExp() >= k4.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - k4.getPrice());
                    App.Papich.setHp(600);
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
