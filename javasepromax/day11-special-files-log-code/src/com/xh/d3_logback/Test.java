package com.xh.d3_logback;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    //1.创建Logback框架的   Logger日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {

        try{
            LOGGER.info("除法开始了");
            chu(10,0);
            LOGGER.info("除法结束了");
        }catch(Exception e){
//            e.printStackTrace();
            LOGGER.error("chu方法执行失败，出现异常："+e.getMessage());
        }

    }
    public static void chu(int a,int b){
        LOGGER.debug("参数a:"+a);
        LOGGER.debug("参数b:"+b);
        int c = a/b;
        LOGGER.info("结果c是:"+c);
    }
}
