package com.example.firebaserealtimedatabase;

public class chatMessage {
    private String text;
    private long time;

    public chatMessage(String text, long time) {
        this.text = text;
        this.time = time;
    }

    public chatMessage() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
