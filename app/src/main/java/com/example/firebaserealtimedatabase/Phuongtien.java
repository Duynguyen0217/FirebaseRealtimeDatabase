package com.example.firebaserealtimedatabase;

public class Phuongtien {
    private String ten;
    private Integer sobanh;

    public Phuongtien(String ten, Integer sobanh) {
        this.ten = ten;
        this.sobanh = sobanh;
    }

    public Phuongtien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getSobanh() {
        return sobanh;
    }

    public void setSobanh(Integer sobanh) {
        this.sobanh = sobanh;
    }

    @Override
    public String toString() {
        return "Phuongtien{" +
                "ten='" + ten + '\'' +
                ", sobanh=" + sobanh +
                '}';
    }
}
