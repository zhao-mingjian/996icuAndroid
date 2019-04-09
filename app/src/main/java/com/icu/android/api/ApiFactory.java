package com.icu.android.api;

public class ApiFactory {
    private static ApiService api;

    private ApiFactory() {
    }

    public static ApiService getSingleApi() {
        if (api == null) {
            api = Api.getDefault(HostType.BASE_URL);
        }
        return api;
    }
}
