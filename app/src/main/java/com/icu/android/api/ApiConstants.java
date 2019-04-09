package com.icu.android.api;

public class ApiConstants {

    public static final String SERVER = "https://996.icu";

    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.BASE_URL:
                host = SERVER;
                break;
            default:
                host = "";
                break;
        }
        return host;
    }
}
