/**
 * *@author Trevor Hartman
 * @author MK Ripley
 *
 * @since Version 1.0
 * 2/24/2023
 */
public class Player {
    private String name;
    private int score;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public int getScore(){
        return this.score;
    }

    public void toss(Dice die) {
        die.roll();
        this.score = die.view();
    }
}
