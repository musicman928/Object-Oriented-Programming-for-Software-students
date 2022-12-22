import java.util.ArrayList;
import java.util.Collections;

public class World {
    private ArrayList<Character> chars;

    private Character globalActionExecuter = new Character(this);

    public World(int initialLength) {
        chars = new ArrayList<Character>(0);
    }


    public void setAllReady() {
        for (int i = 0; i < chars.size(); i++) {
            chars.get(i).setReady(true);
        }
    }

    public void addCharacter(Character e) {
        chars.add(e);
    }

    public Character getCharacter(int index) {
        return chars.get(index);
    }

    public ArrayList<Character> getCharacters() {
        return chars;
    }

    public Character getNextTurn() {
        ArrayList<Character> readychars = (ArrayList<Character>) chars.clone();
        for (int i = 0; i < readychars.size(); i++) {
            if (!readychars.get(i).isReady()) {
                readychars.remove(i);
                i--;
            }
        }
        if (readychars.size() == 0) {
            return null;
        }
        Collections.sort(readychars);
        Collections.reverse(readychars);
        return readychars.get(0);

    }

    public boolean hasNextTurn() {
        ArrayList<Character> readychars = (ArrayList<Character>) chars.clone();
        for (int i = 0; i < readychars.size(); i++) {
            if (!readychars.get(i).isReady()) {
                readychars.remove(i);
                i--;
            }
        }
        return readychars.size() > 0;

    }

    public void globalAction(Action action) {
        globalActionExecuter.addMove(action);
        globalActionExecuter.getMove(0).target(globalActionExecuter);
    }

    public Character getGlobalActionExecuter() {
        return globalActionExecuter;
    }

    public boolean checkVictory() {
        if (this.getCharacters().size() < 2 && this.getCharacter(0).getHP() > 0) {
            System.out.println("You won!");
        }

        return this.getCharacters().size() < 2 && this.getCharacter(0).getHP() > 0;
    }

    public boolean checkDefeat() {
        if (!this.getCharacter(0).isAlive()) {
            System.out.println("You lost");
        }
        return !this.getCharacter(0).isAlive();
    }

    public void printScreen() {
        System.out.println();
        for (int i = 0; i < getCharacters().size(); i++) {
            System.out.println(getCharacter(i));
        }
        System.out.println();
    }


}
