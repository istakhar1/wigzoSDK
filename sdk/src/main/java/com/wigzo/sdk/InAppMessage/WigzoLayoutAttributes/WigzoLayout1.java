package com.wigzo.sdk.InAppMessage.WigzoLayoutAttributes;

/**
 * Created by Rihan.
 */

public class WigzoLayout1 extends WigzoLayoutProperties {
    private WigzoLayout1() {
        hasImage = true;
    }

    public static WigzoLayout1 getInstance() {
        return new WigzoLayout1();
    }
}
