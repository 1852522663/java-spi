package cn.memset.spi;

import cn.memset.spi.InternetService;

/**
 * @author 岳贺伟
 * @description
 * @data
 */
public class ChinaUnicom implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("连接联通");
    }
}
