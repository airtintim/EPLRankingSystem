/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author user
 */
public class Team implements Comparable<Team>{
    private String name;
    private int win;
    private int draw;
    private int lose;
    private int ELO;

    public Team() {
    }
    
    public Team(String name) {
        this.name = name;
        this.ELO = 1000;
    }

    public int getELO() {
        return ELO;
    }

    public void setELO(int ELO) {
        this.ELO = ELO;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public String getName() {
        return name;
    }
    
    public void win() {
        win++;
    }
    
    public void lose() {
        lose++;
    }
    
    public void draw() {
        draw++;
    }

    @Override
    public int compareTo(Team t) {
        return t.ELO - this.ELO;
    }
}
