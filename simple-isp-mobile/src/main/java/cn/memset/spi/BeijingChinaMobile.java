package cn.memset.spi;




/**
 * @author 岳贺伟
 * @description
 * @data
 */
public class BeijingChinaMobile implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("连接北京");
    }
}
