package BehavioralPatterns.Observer;

public class ClockTimer extends Subject{
    public int getHour(){
        return 0;
    }
    public int getMinute(){
        return 0;
    }
    public int getSecond(){
        return 0;
    }

    public void tick(){
        notifyS();
    }
}
