# Final Project: RPG Engine

## Synopsis
This is a simple RPG engine that I programmed in Java for my final project of OOP 1.

## Motivation
This is an upgrade of one of my final projects from a previous class. I was really excited to make a game with OOP and this was one of the simplest ways to do so.

## How to Run

The class with the main() method is 'GameStart.java' It is also helpful to include a screenshot of the program running.
[Image Caption](game.PNG)

## Code Example
I am really proud of the abstract Action class as a whole.

```
public abstract class Action {
    private Character owner;
    private String name;
    public Action(Character owner) {
        this.owner = owner;
    }
    public Character getOwner() {
        return owner;
    }
    abstract public void target(Character target);

    abstract public String getName();

}
```

This made it really simple to add effects and attacks to the game. It really sped up the process of developing this project by a lot.


## Contributors
I would like to credit GameFreak for the damage calculation formula I used. I'm a big fan of Pokemon and wanted to use this formula in the game, I hope that's ok.
