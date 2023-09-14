package com.dmdev.http.pac1;

import java.io.IOException;
import java.net.*;

public class DatagramRunner {

    public static void main(String[] args) throws IOException {
        var localHost = InetAddress.getLocalHost();
        try (var datagramSocket = new DatagramSocket()) {
//            ------> [buffer] <------
            var bytes = "Hello from UPD client".getBytes();

            var packet = new DatagramPacket(bytes, bytes.length, localHost, 7777);
            datagramSocket.send(packet);
        }
    }
}
