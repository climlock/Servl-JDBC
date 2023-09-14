package com.dmdev.http.pac1.ndTask;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketServerRunner {

    public static void main(String[] args) throws IOException {
        var localhost = Inet4Address.getByName("localhost");

        try (var server = new ServerSocket(7777);
             var socket = server.accept();
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream())) {

            System.out.println(inputStream.readUTF());
        }
    }
}
