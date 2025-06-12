package com.xh.d1_inetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取本机IP地址对象
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println(localAddress.getHostName());
        System.out.println(localAddress.getHostAddress());
        System.out.println(localAddress.isReachable(500));


        //2.获取指定IP地址对象
        InetAddress remoteAddress = InetAddress.getByName("www.baidu.com");
        System.out.println(remoteAddress.getHostName());
        System.out.println(remoteAddress.getHostAddress());
        System.out.println(remoteAddress.isReachable(500));


    }
}
