package com.wigzo.sdk.base;

import org.json.JSONObject;

public abstract class Model {
    public abstract JSONObject toJson();

    public abstract boolean isValid() throws ValidationException;
}
