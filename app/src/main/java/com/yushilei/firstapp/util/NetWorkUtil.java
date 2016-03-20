package com.yushilei.firstapp.util;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by jh on 2016/3/20.
 */
public class NetWorkUtil {
    public interface Service {

    }

    private static Service service;

    static {
        service = new Retrofit.Builder().baseUrl("http;//www.baidu.com")
                .addConverterFactory(GsonConverterFactory.create()).build()
                .create(Service.class);
    }
}
