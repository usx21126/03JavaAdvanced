package com.xh.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {

        //创建接收端对象
        DatagramSocket socket =new DatagramSocket(8888);
        byte[] buf = new byte[1024*64];
        //创建数据包对象
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //接收数据
        socket.receive(packet);
        int len = packet.getLength();

        System.out.println("对方ip:"+packet.getAddress().getHostAddress());
        System.out.println("对方端口:"+packet.getPort());
        //打印
        String msg = new String(buf,0,len);
        System.out.println(msg);
        //释放资源
        socket.close();
    }
}
