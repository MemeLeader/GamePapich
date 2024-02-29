package pack_game;

public class HeroStats {
    public static void hs() {
        System.out.println("Хп: " + App.Papich.getHp());
        System.out.println("Урон: " + App.Papich.getDmg());
        System.out.println("Опыт: " + App.Papich.getExp());
        System.out.println("Способность: " + App.Papich.getSkill());
        System.out.println("Урон способности: " + App.Papich.getSkillDmg());
        System.out.println("Затраты маны на способность: " + App.Papich.getManaCost());
        System.out.println("Мана: " + App.Papich.getMana());
        Menu.display();
    }
}
