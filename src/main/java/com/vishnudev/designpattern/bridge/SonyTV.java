package com.vishnudev.designpattern.bridge;

public class SonyTV implements TV {
    @Override
    public void on() {
        System.out.println("Sony TV is turned ON");
    }

    @Override
    public void off() {
        System.out.println("Sony TV is turned OFF");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Sony TV tuned to channel " + channel);
    }
}
