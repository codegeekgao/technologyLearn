package com.codegeek.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socketServer
 *
 * @author CodeGeekGao
 * @version Id: SocketProvider.java, v 0.1 2018/9/18 9:53 CodeGeekGao Exp $$
 */
public class SocketProvider {

    public static void main(String[] args) {
        try {
            ServerSocket socketProvider = new ServerSocket(1234);
            while (true) {
                Socket accept = socketProvider.accept();
                ObjectInputStream stream = new ObjectInputStream(accept.getInputStream());
                String interfaceName = stream.readUTF();
                String methodName = stream.readUTF();
                Class<?>[] parameterType = (Class<?>[]) stream.readObject();
                Object[] o = (Object[]) stream.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
