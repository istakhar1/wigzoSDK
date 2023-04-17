package com.wigzo.sdk.tasks;

import com.wigzo.sdk.Wigzo;
import com.wigzo.sdk.base.Task;
import com.wigzo.sdk.base.ValidationException;
import com.wigzo.sdk.helpers.Configuration;
import com.wigzo.sdk.helpers.StringUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class FCMRegister extends Task {

    private String registrationId;

    public FCMRegister(){}
    public FCMRegister(String registrationId) {
        this.registrationId = registrationId;
    }

    FCMRegister setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    public String getRegistrationId() {
        return this.registrationId;
    }

    @Override
    protected String buildUrl() {
        return Configuration.BASE_URL.value + Configuration.FCM_REGISTRATION_URL.value + "?"
                + Configuration.SITE_ID.value + "=" + Wigzo.getOrgToken();
    }

    @Override
    public JSONObject toJson() {
        JSONObject data = new JSONObject();
        try {
            if (StringUtils.isNotEmpty(this.registrationId)) {
                data.put("registrationId", this.registrationId);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    protected boolean validate() throws ValidationException {
        if(StringUtils.isEmpty(this.registrationId)) {
            throw new ValidationException("Firebase registration ID cannot be blank");
        }
        return true;
    }
}
