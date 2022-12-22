import java.util.ArrayList;

public class CharacterDefinitions {

    public static Character definePlayer(World world) {
        Character player = new Character(world,true, "Player", 500, 100, 150, 100, 100, 70, 120, new ArrayList<>());
        player.addMove(new Attack(player, "Enthusiastic slap",200,true));
        player.addMove(new HealthPotion(player));
        player.addMove(new WarCry(player));
        return player;
    }

    public static Character defineTinyBug(World world) {
        Character tinyBug = new Character(world,false, "Tiny bug", 1, 1, 1, 1, 1, 1, 900, new ArrayList<>());
        tinyBug.addMove(new Wiggle(tinyBug));
        int[][] tinyBugScript = {{0,0}};
        tinyBug.setTurnScript(tinyBugScript);
        return tinyBug;
    }

    public static Character defineKaren(World world) {
        Character karen = new Character(world,false, "Karen", 4000, 100, 100, 100, 150, 30, 70, new ArrayList<>());
        karen.addMove(new Attack(karen, "Ear-Piercing Screech", 50, false));
        int[][] karenScript = {{0,0}};
        karen.setTurnScript(karenScript);
        return karen;
    }
}
