package com.example.dell_user.one.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by DELL-USER on 2017/2/15.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().
                url(address)
                .build();
        okHttpClient.newCall(request).enqueue(callback);

    }
}
