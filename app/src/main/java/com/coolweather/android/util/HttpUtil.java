package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    // ʹ��OkHttp����һ�����ʷ��������ݵĹ�����
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();    // ���� OKHttpClient ����
        Request request = new Request.Builder().url(address).build();    // ���������ַ
        client.newCall(request).enqueue(callback);    // ע�����ڴ����������Ӧ�Ļص�
    }
}