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
        service = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("http://www.baidu.com")
                .build().create(Service.class);
    }
}
