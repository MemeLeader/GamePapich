package pack_game;

import java.util.Scanner;

public class Shop {
    private int price;

    public Shop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void magaz(){
        System.out.println("----------------------------------------------------");
        System.out.println("|Добро пожаловать в таверну! Выберите желаем товар |");
        System.out.println("|1.Купить оружее                                   |");
        System.out.println("|2.Купить камни здоровья                           |");
        System.out.println("|3.Купить заклинание                               |");
        System.out.println("|0.Уйти                                            |");
        System.out.println("----------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                DMG.dmg();
                break;
            case 2:
                Hp.hp();
                break;
            case 3:
                Skil.skill();
                break;
            case 0:
                Menu.display();

        }

    }
}
