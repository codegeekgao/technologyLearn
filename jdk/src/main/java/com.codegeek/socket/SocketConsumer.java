package com.codegeek.socket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * socket消费方
 *
 * @author CodeGeekGao
 * @version Id: SocketConsumer.java, v 0.1 2018/9/18 9:54 CodeGeekGao Exp $$
 */
public class SocketConsumer {

    public static void main(String[] args) {
        try {
            // 接口名称
            String interfaceName = DemoService.class.getName();
            // 执行的方法
            Method method = DemoService.class.getMethod("sayHello", String.class);
            // 传递的参数
            Object[] arguments = {"hello"};
            // 创建Socket对象
            Socket socket = new Socket("127.0.0.1",1234);
            // 使用流
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeUTF(interfaceName);
            oos.writeUTF(method.getName());
            oos.writeObject(method.getParameterTypes());
            oos.writeObject(arguments);

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Object o = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
