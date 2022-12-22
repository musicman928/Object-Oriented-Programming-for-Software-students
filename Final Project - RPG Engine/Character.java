import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Character implements Comparable<Character>  {
    final private World world;
    final private String Name;
    final private int HP;
    final private int MP;
    final private int Atk;
    private int AtkMult = 0;
    final private int Def;
    private int DefMult = 0;
    final private int Pow;
    private int PowMult = 0;
    final private int Res;
    private int ResMult = 0;
    final private int Spd;
    private int SpdMult = 0;
    private boolean PlayerSide;
    private ArrayList<Action> moves = new ArrayList<>();
    //private ArrayList<Effect> effects = new ArrayList<>();
    private boolean ready = true;
    private int[][] turnScript;
    private String[] turnDialogue;
    private int turn = 0;
    private Action DeathAction = new EmptyAction(this);

    private int Health;
    private int Mana;
    private boolean isalive = true;

    public Character(World world) {
        this.world = world;
        PlayerSide = true;
        Name = "Calc";
        HP = 0;
        MP = 0;
        Atk = 0;
        Def = 100;
        Pow = 100;
        Res = 100;
        Spd = 100;
    }

    public Character(World world, boolean PlayerSide, String Name, int HP, int MP, int Atk, int Def, int Pow, int Res, int Spd) {
        this.world = world;
        this.PlayerSide = PlayerSide;
        this.Name = Name;
        this.HP = HP;
        this.MP = MP;
        this.Atk = Atk;
        this.Def = Def;
        this.Pow = Pow;
        this.Res = Res;
        this.Spd = Spd;

        Health = HP;
        Mana = MP;
    }

    public Character(World world, boolean PlayerSide, String Name, int HP, int MP, int Atk, int Def, int Pow, int Res, int Spd, ArrayList<Action> moves) {
        this.world = world;
        this.PlayerSide = PlayerSide;
        this.Name = Name;
        this.HP = HP;
        this.MP = MP;
        this.Atk = Atk;
        this.Def = Def;
        this.Pow = Pow;
        this.Res = Res;
        this.Spd = Spd;
        this.moves = moves;

        Health = HP;
        Mana = MP;
    }

    public Character(World world, boolean PlayerSide, String Name, int HP, int MP, int Atk, int Def, int Pow, int Res, int Spd, ArrayList<Action> moves, int[][] turnScript, String[] turnDialogue) {
        this.world = world;
        this.PlayerSide = PlayerSide;
        this.Name = Name;
        this.HP = HP;
        this.MP = MP;
        this.Atk = Atk;
        this.Def = Def;
        this.Pow = Pow;
        this.Res = Res;
        this.Spd = Spd;
        this.moves = moves;
        this.turnScript = turnScript;

        Health = HP;
        Mana = MP;
    }

    public boolean isAlive() {
        return isalive;
    }

    public World getWorld() {
        return world;
    }

    public void setTurnScript(int[][] script) {
        turnScript = script;
    }
    public void startTurn() {
        if (isPlayerSide()) {
            int[] action = getPlayerInput();
            getMove(action[0]).target(world.getCharacter(action[1]));
        }else {startScriptedTurn();}

    }

    public void startScriptedTurn() {
        getMove(turnScript[turn][0]).target(world.getCharacter(turnScript[turn][1]));
        if (turnScript.length - 1 > turn) {
            turn++;
        }

    }

    public int[] getPlayerInput() {
        int[] out = new int[2];
        boolean done = false;
        while (!done) {

            System.out.printf("What should %s do?\n", getName());
            for (int i = 0; i < getMoves().size(); i++) {
                System.out.printf("%d: %s\n", i, moves.get(i).getName());
            }
            Scanner in = new Scanner(System.in);
            System.out.print(">:");
            try {
                out[0] = Integer.parseInt(in.nextLine());
                Action e = moves.get(out[0]);
                done = true;
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
            }
        }
        done = false;
        while (!done) {

            System.out.printf("Who to target?\n");
            for (int i = 0; i < world.getCharacters().size(); i++) {
                System.out.printf("%d: %s\n", i, world.getCharacter(i).getName());
            }
            Scanner in = new Scanner(System.in);
            System.out.print(">:");
            try {
                out[1] = Integer.parseInt(in.nextLine());
                Character e = world.getCharacter(out[1]);
                done = true;
            }catch (Exception e) {
                System.out.println("Invalid input, try again.");
            }
        }
        return out;
    }

    private boolean isPlayerside() {
        return PlayerSide;
    }

    public boolean isPlayerSide() {
        return PlayerSide;
    }

    public ArrayList<Action> getMoves() {
        return moves;
    }

    public Action getMove(int index) {
        return moves.get(index);
    }

    public Action getMove(String name) {
        int index = -1;
        System.out.println(moves.size());
        System.out.println(((Attack) moves.get(0)).getName());
        for (int i = 0; i < moves.size() - 1; i++) {
            if (((Attack) moves.get(i)).getName().equalsIgnoreCase(name)) {
                index = i;
            }
        }

        return moves.get(index);

    }

    public void addMove(Action in) {
        moves.add(in);
    }

    public void boostAtk(int mult) {
        AtkMult += mult;
    }

    public String getName() {
        return Name;
    }

    public int getHP() {
        return Health;
    }

    public int getMaxHP() {
        return HP;
    }

    public int getMP() {
        return Mana;
    }

    public int getAtk() {
        return (int) (Atk + Math.round((Atk*0.5) * getAtkMult()));
    }

    public int getDef() {
        return (int) (Def + Math.round((Def*0.5) * getDefMult()));
    }

    public int getSpd() {
        return (int) (Spd + Math.round((Spd*0.5) * getSpdMult()));
    }

    public int getPow() {
        return (int) (Pow + Math.round((Pow*0.5) * getPowMult()));
    }

    public int getRes() {
        return (int) (Res + Math.round((Res*0.5) * getResMult()));
    }

    public int getAtkMult() {
        return AtkMult;
    }

    public int getDefMult() {
        return DefMult;
    }

    public int getSpdMult() {
        return SpdMult;
    }

    public int getPowMult() {
        return PowMult;
    }

    public int getResMult() {
        return ResMult;
    }

    public boolean isReady(){
        return ready;
    }

    public boolean heal(int amount) {
        if (getHP() == getMaxHP()) {
            return false;

        }else if (Health + amount > getMaxHP()) {
            Health = getMaxHP();
        }else {
            Health += amount;
        }
        return true;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setPlayerSide(boolean PlayerSide) {
        this.PlayerSide = PlayerSide;
    }

    private void takeDmg(int amount) {
        Health -= amount;
    }

    public void swing(Character attacker, Attack attack) {
        int damage;
        int Defense;
        int Attackpow;
        if (attack.isPhysical()) {
            Defense = getDef();
            Attackpow = attacker.getAtk();
        } else {
            Defense = getRes();
            Attackpow = attacker.getPow();
        }
        damage = ((42 * attack.getBasePower() * (Attackpow/Defense)) / 50) + 2;
        takeDmg(damage);
        if (Health <= 0) {
            System.out.println(getName() + " Died :(");
            deathCheck();
        }
    }

    private void deathCheck() {
        if (Health <= 0) {
            isalive = false;
            onDeath();
        }
    }

    @Override
    public int compareTo(Character o) {
        double c = (this.getSpd() - o.getSpd());
        int out = (int) (c / (Math.abs(c)));

        if (out == 0) {
            // if two characters are the same speed, choose the faster character by random.
            Random randy = new Random();
            out = (randy.nextInt(2) * 2) - 1;
            System.out.println(out);
        }
        return out;
    }

    public String toString() {
        return Name + ", " + getHP() + "/" + getMaxHP() + "HP, " + getMP() + "MP";
    }

    public void setDeathAction() {

    }

    public void onDeath() {
        if (!isPlayerSide()) {
            clean();
        }
        world.globalAction(DeathAction);
    }

    public void clean() {
        world.getCharacters().remove(this);
    }
}
