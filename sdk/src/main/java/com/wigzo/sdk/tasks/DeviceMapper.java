package com.wigzo.sdk.tasks;

import com.wigzo.sdk.helpers.Configuration;
import com.wigzo.sdk.Wigzo;
import com.wigzo.sdk.base.Task;
import com.wigzo.sdk.helpers.StringUtils;
import com.wigzo.sdk.models.DeviceInfo;

import org.json.JSONException;
import org.json.JSONObject;

public class DeviceMapper extends Task {

    @Override
    protected String buildUrl() {
        return Configuration.BASE_URL.value + Configuration.INITIAL_DATA_URL.value + "?"
                + Configuration.SITE_ID.value + "=" + Wigzo.getOrgToken();
    }

    @Override
    public JSONObject toJson() {
        JSONObject data = new JSONObject();
        try {
            data.put("deviceInfo", (new DeviceInfo()).toJson());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
//        return new JSONObject();
    }

    @Override
    protected boolean validate() {
        return true;
    }
}
