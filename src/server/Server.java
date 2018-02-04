package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Server Signing ON");
        ServerSocket ss = new ServerSocket(9081);
        Socket soc = ss.accept();
        BufferedReader nis = new BufferedReader(
                                new InputStreamReader(
                                        soc.getInputStream()
                                )
        );
        String str = nis.readLine();
        while(!str.equals("End"))
        { 
            System.out.println("Server Recived = " + str);
            str =  nis.readLine();
        }
        System.out.println("Server Signing OFF");
    }
    
}