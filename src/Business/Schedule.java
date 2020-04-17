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
public class Schedule {
    private String date;
    private Team home;
    private Team away;
    private float homeWinRate;
    private String result;

    public Schedule(String date, Team home, Team away) {
        this.date = date;
        this.home = home;
        this.away = away;
        updateWinRate();
        this.result = "-";
    }

    public String getDate() {
        return date;
    }

    public Team getHome() {
        return home;
    }

    public Team getAway() {
        return away;
    }

    public int getHomeWinRate() {
        return (int) homeWinRate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    public void updateWinRate() {
        homeWinRate = (float) (100 / (1 + Math.pow(10, (away.getELO() - home.getELO()) / 400.0)));
    }
}
