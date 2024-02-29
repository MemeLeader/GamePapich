package pack_game;

public class Hero extends Boss {
    private int mana;
    private int ManaCost;

    public Hero(String name, int hp, int dmg, int exp, String skill, int skillDmg, int mana, int ManaCost) {
        super(name, hp, dmg, exp, skill, skillDmg);
        this.mana = mana;
        this.ManaCost = ManaCost;
    }

    public int getMana() {
        return mana;
    }

    public int getManaCost() {
        return ManaCost;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setManaCost(int manaCost) {
        ManaCost = manaCost;
    }
}