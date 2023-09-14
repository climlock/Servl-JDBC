package com.dmdev.http.pac1.ndTask;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientRunner {

    public static void main(String[] args) throws IOException {

        var localHost = Inet4Address.getLocalHost();

        try (var socket = new Socket(localHost, 7777);
             var inputStream = new DataInputStream(socket.getInputStream());
             var outputStream = new DataOutputStream(socket.getOutputStream())) {
            outputStream.writeUTF("Hello from Client");
        }
    }
}
