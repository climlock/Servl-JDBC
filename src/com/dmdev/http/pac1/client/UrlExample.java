package com.dmdev.http.pac1.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {

    public static void main(String[] args) throws IOException {

        var url = new URL("file:\\Users\\chuma\\IdeaProjects\\HTTP-Servlets\\src\\com\\dmdev\\http\\pac1\\DatagramRunner.java");
        var urlConnection = url.openConnection();

        //System.out.println(new String (urlConnection.getInputStream().readAllBytes()));
        ChechGoogle();
    }
    private static void ChechGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        var urlConnection = url.openConnection();

        urlConnection.setDoOutput(true);

        try (var outputStream = urlConnection.getOutputStream()) {

        }

        System.out.println(urlConnection.getHeaderField(1));
    }
}
