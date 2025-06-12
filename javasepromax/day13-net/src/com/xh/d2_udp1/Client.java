package com.xh.d2_udp1;

import java.net.*;

//客户端 发送数据
public class Client {
    public static void main(String[] args) throws Exception {
        //创建发送端对象
        DatagramSocket socket =  new DatagramSocket();
        //创建发送数据包
        byte[] buf = "Hello World".getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"),8888);
        //发送数据
        socket.send(packet);
        //释放资源
        socket.close();
        System.out.println("客户端发送完毕");
    }
}
