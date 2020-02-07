package com.company;

public class outlander extends car {
    private int roadservicemonths;

    public outlander( int roadservicemonths) {
        super("outlander", "wf", 4, 2, 6, false);
        this.roadservicemonths = roadservicemonths;
    }
    public void accelerate(int rate){
        int newvelocity = getCurrentvelocity()+rate;
        if(newvelocity == 0){
            //stop();
            changegear(1);
        }else if(newvelocity >0 &&newvelocity<10){
            changegear(1);

        }else if(newvelocity >10 &&newvelocity<20){
            changegear(2);
        }else if(newvelocity >20 &&newvelocity<30){
            changegear(3);
        }else {
            changegear(4);
        }
        if(newvelocity>0){
            changevelocity(newvelocity, getCurrentdirection());
        }
        System.out.println();

    }
}
