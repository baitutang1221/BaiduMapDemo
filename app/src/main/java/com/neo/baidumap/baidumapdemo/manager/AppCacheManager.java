package com.neo.baidumap.baidumapdemo.manager;


import com.baidu.mapapi.map.MyLocationData;

/**
 * Created by xiazhenjie on 2017/9/13.
 */

public class AppCacheManager {

    public MyLocationData locData;

    private static final AppCacheManager ourInstance = new AppCacheManager();

    public static AppCacheManager getInstance() {
        return ourInstance;
    }

    public MyLocationData getLocData() {
        return locData;
    }

    public void setLocData(MyLocationData locData) {
        this.locData = locData;
    }
}
