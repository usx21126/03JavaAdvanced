package com.xh.d1_byte_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //覆盖管道
//        FileOutputStream os = new FileOutputStream("day09-io-code\\src\\com\\xh\\d1_byte_stream\\xh04.txt");
        //追加管道
        FileOutputStream os = new FileOutputStream(
                "day09-io-code\\src\\com\\xh\\d1_byte_stream\\xh04.txt",
                true
        );


        //写数据
         os.write(97);
         os.write("我爱你中国".getBytes());
         os.write("亲爱的母亲~".getBytes(),0,9);
         os.close();

    }
}
