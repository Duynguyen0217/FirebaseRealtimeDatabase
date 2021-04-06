package com.example.firebaserealtimedatabase;

public class Message {
    private String text;
    private long time;

    public Message(String text, long time) {
        this.text = text;
        this.time = time;
    }

    public Message() {
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

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", time=" + time +
                '}';
    }
}
