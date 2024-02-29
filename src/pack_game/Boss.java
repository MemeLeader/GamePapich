package pack_game;

public class Boss extends Mobs {
    private String Skill;
    private int SkillDmg;

    public Boss(String name, int hp, int dmg, int exp, String skill, int skillDmg) {
        super(name, hp, dmg, exp);
        Skill = skill;
        SkillDmg = skillDmg;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        Skill = skill;
    }

    public int getSkillDmg() {
        return SkillDmg;
    }

    public void setSkillDmg(int skillDmg) {
        SkillDmg = skillDmg;
    }
}
