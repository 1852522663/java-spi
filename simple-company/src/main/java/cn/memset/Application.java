package cn.memset;



import cn.memset.spi.InternetService;


import java.util.ServiceLoader;

/**
 * @author 岳贺伟
 * @description
 * @data
 */

public class Application {
    public static void main(String[] args) {
        ServiceLoader<InternetService> loader=ServiceLoader.load(InternetService.class);

        for (InternetService provider:loader) {
            provider.connectInternet();
        }
    }
}
