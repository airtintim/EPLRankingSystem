/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ScheduleList {
    private List<Schedule> scheduleList;
    private int finishNum;

    public ScheduleList() {
        scheduleList = new ArrayList<>();
    }

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }
    
    public void addSchedule(Schedule s) {
        scheduleList.add(s);
    }

    public int getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(int finishNum) {
        this.finishNum = finishNum;
    }
    
    public void updateList() {
        for (int i = finishNum; i < scheduleList.size(); i++) {
            scheduleList.get(i).updateWinRate();
        }
    }
    
    public boolean checkFinish() {
        return finishNum == scheduleList.size() - 1;
    }
}
