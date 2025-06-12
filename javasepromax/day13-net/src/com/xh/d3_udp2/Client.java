package com.xh.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

//多发多收
//客户端 发送数据
public class Client {
    public static void main(String[] args) throws Exception {
        //创建发送端对象
        DatagramSocket socket =  new DatagramSocket();
        //创建发送数据包
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a command: ");
            String command = sc.nextLine();
            if(command.equals("exit")){
                System.out.println("Goodbye!");
                break;
            }
            byte[] buf = command.getBytes();
            DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"),8888);

            //发送数据
            socket.send(packet);
        }
        //释放资源
        socket.close();
        System.out.println("客户端发送完毕");
    }
}
