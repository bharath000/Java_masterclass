package com.company;

public class motherboard {
    private String model;
    private String manufacture;
    private int ramslots;
    private int cardslots;
    private String bios;

    public motherboard(String model, String manufacture, int ramslots, int cardslots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramslots = ramslots;
        this.cardslots = cardslots;
        this.bios = bios;
    }
    public void loadProgram(String programname){
        System.out.println("program name"+programname);
    }


    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardslots() {
        return cardslots;
    }

    public String getBios() {
        return bios;
    }
}
