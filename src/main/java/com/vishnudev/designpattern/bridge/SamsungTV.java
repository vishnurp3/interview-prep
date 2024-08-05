package com.vishnudev.designpattern.bridge;

public class SamsungTV implements TV {
    @Override
    public void on() {
        System.out.println("Samsung TV is turned ON");
    }

    @Override
    public void off() {
        System.out.println("Samsung TV is turned OFF");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Samsung TV tuned to channel " + channel);
    }
}
