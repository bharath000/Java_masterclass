package com.company;

public class PC {
    private Case thecase;
    private monitor monitor;
    private motherboard motherboard;

    public PC(Case thecase, com.company.monitor monitor, com.company.motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerup(){
        thecase.pressPowerbutton();
        drawlogo();
    }
    public void drawlogo(){
        monitor.drawPixel(7,8,"red");
    }

/*
    public Case getThecase() {
        return thecase;
    }

    public com.company.monitor getMonitor() {
        return monitor;
    }

    public com.company.motherboard getMotherboard() {
        return motherboard;
    }*/
}
