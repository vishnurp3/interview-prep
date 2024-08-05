package com.vishnudev.designpattern.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }
}
