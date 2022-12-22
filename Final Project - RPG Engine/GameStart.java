import java.util.ArrayList;
import java.util.Arrays;

public class GameStart {
    public static void main(String[] args) {

        World world = new World(0);

        world.addCharacter(CharacterDefinitions.definePlayer(world));

        world.addCharacter(CharacterDefinitions.defineTinyBug(world));

        System.out.println("You see a bug on the ground that starts looking at you in a way that makes you feel very uncomfortable, you try to scream but no sound comes out, so you do what any logical person would do; kill.");

        System.out.println("You hesitantly approach the tiny bug.");
        System.out.println("The tiny bug holds your gaze.");

        System.out.println("\nxX BATTLE START Xx\n");

        while (!world.checkVictory() && !world.checkDefeat()) {
            world.setAllReady();
            while (world.hasNextTurn()) {
                world.printScreen();
                world.getNextTurn().startTurn();
            }
        }

        world = new World(0);

        world.addCharacter(CharacterDefinitions.definePlayer(world));

        world.addCharacter(CharacterDefinitions.defineKaren(world));

        System.out.println("");

        System.out.println("An angry karen approaches you, her face covered in fury. She howls at you, voice cracking. \"HOW COULD YOU MURDER SUCH AN INNOCENT CREATURE?!??! I'M CALLING THE POLICE!!!\"");
        System.out.println("She takes out her phone and calls the police on speaker phone. The police man says they'll be there in 10 turns. \"WHAT IS THAT SUPPOSED TO MEAN????\" The angry karen charges you.");

        System.out.println("\nxX BATTLE START Xx\n");
        int turn = 1;
        while (!world.checkVictory() && !world.checkDefeat() && turn < 10) {
            System.out.println("Turn " + turn);
            world.setAllReady();
            while (world.hasNextTurn()) {
                world.printScreen();
                world.getNextTurn().startTurn();
            }
            turn++;
        }

        if (turn == 10) {
            System.out.println("The police arrived and immediately filled you with holes, the bug was then taken to the hospital. The doctors expect a full recovery.");
            System.out.println("Game Over\nBad Ending");
        }else {
            System.out.println("You manage to bring down the beast and escape before the police arrive, you see that the tiny bug you stomped is still struggling. You decide to put it out of it's misery.");
            System.out.println("Game Over\nGood Ending");
        }

    }
}
