package com.vishnudev.designpattern.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        TV sony = new SonyTV();
        RemoteControl sonyRemote = new AdvancedRemoteControl(sony);

        sonyRemote.on();
        sonyRemote.setChannel(5);
        sonyRemote.off();

        TV samsung = new SamsungTV();
        RemoteControl samsungRemote = new AdvancedRemoteControl(samsung);

        samsungRemote.on();
        samsungRemote.setChannel(10);
        samsungRemote.off();

    }
}
