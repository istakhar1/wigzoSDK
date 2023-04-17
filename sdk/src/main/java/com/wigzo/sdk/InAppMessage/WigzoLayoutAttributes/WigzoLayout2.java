package com.wigzo.sdk.InAppMessage.WigzoLayoutAttributes;

/**
 * Created by Rihan.
 */

public class WigzoLayout2 extends WigzoLayoutProperties {
    private WigzoLayout2() {
        hasImage = true;
    }

    public static WigzoLayout2 getInstance() {
        return new WigzoLayout2();
    }
}
