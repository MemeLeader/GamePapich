package pack_game;

import java.util.Scanner;

public class Skil {
    public static void  skill(){
        Scanner sc = new Scanner(System.in);
        Shop s1 = new Shop(500);
        Shop s2 = new Shop(1000);
        Shop s3 = new Shop(2000);
        Shop s4 = new Shop(10000);
        System.out.println("1. Панцерфакер / 500");
        System.out.println("2. Реки мочи / 1000");
        System.out.println("3. Волос жабы / 2000");
        System.out.println("4. ? / 10000");
        System.out.println("0. Уйти");
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                if(App.Papich.getExp() >= s1.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - s1.getPrice());
                    App.Papich.setSkillDmg(100);
                    App.Papich.setSkill("Панцефакер");
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
                break;
            case 2:
                if(App.Papich.getExp() >= s2.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - s2.getPrice());
                    App.Papich.setSkillDmg(200);
                    App.Papich.setSkill("Панцефакер");
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
                break;
            case 3:
                if(App.Papich.getExp() >= s3.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - s3.getPrice());
                    App.Papich.setSkillDmg(400);
                    App.Papich.setSkill("Панцефакер");
                    System.out.println("Спасибо за покупку!");
                }else{
                    System.out.println("Пошел вон нищедрот");
                }
            case 4:
                if(App.Papich.getExp() >= s4.getPrice()){
                    App.Papich.setExp(App.Papich.getExp() - s4.getPrice());
                    App.Papich.setSkillDmg(9999);
                    App.Papich.setSkill("ТВАЯ МАТЬ ХААХАХАХАХАХАХ");
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
