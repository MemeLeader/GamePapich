package pack_game;
import pack_game.Menu;

public class GameF {
    public static int count = 0;
    public static void GameF() {
        while (count < 5){
                count++;
                MobsF.mobsf();
        }
        BossF.bossf();

    }
}