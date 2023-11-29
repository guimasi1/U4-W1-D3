package es2;

public class Call {
    String calledNumber;
    int duration;

    public Call(String calledNumber, int duration) {
        this.calledNumber = calledNumber;
        this.duration = duration;
    }

    public String getCalledNumber() {
        return this.calledNumber;
    }
    public int getDuration() {
        return this.duration;
    }

}
