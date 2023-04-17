package com.wigzo.sdk.tasks;

import com.wigzo.sdk.Wigzo;
import com.wigzo.sdk.base.Task;
import com.wigzo.sdk.base.ValidationException;
import com.wigzo.sdk.base.WigzoNotification;
import com.wigzo.sdk.helpers.Configuration;
import com.wigzo.sdk.helpers.StringUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class NotificationRecieved extends WigzoNotification {

    public NotificationRecieved(){}

    public NotificationRecieved (long campaignId, long organizationId) {
        this.campaignId = campaignId;
        this.organizationId = organizationId;
    }

    @Override
    protected String buildUrl() {
        return Configuration.BASE_URL.value + Configuration.FCM_READ_URL.value + "?"
                + Configuration.SITE_ID.value + "=" + Wigzo.getOrgToken();
    }
}
