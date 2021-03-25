package com.company;

public class Bed {

    private String style;
    private int pillows;
    private int heigth;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int heigth, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.heigth = heigth;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("the bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
