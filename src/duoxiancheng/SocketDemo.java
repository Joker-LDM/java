package duoxiancheng;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) {
        try {
            Socket socket = null;
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                System.out.println("????????????......");
                socket = ss.accept();
                System.out.println("???????????");
                OutputStream os = socket.getOutputStream();//??????????§Þ??????????????????????¦Ä????????
                OutputStreamWriter osw = new OutputStreamWriter(os);
                PrintWriter out = new PrintWriter(osw);
                out.println("?????XXX");
                out.flush();

                //????????????
                GetMessageThread getMessageThread = new GetMessageThread(socket);
                getMessageThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
