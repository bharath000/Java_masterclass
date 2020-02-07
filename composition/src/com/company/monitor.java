package com.company;

public class monitor {
    private String model;
    private String manfacturer;
    private int size;
    private Resolution nativeResolution;

    public monitor(String model, String manfacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println(x + y + color);

    }

    public String getModel() {
        return model;
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
