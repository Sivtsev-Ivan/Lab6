package Lab6;

import java.io.*;

public class prim1 {
    public static void main(String[] args) throws IOException {
        Reader in=null;
        Writer out=null;
        try {
            in = new FileReader("C:\\Games\\MyFile1.txt"); // файл для чтения
            out= new FileWriter("C:\\Games\\MyFile2.txt", true);
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
                // out.write((char)oneByte); // запись с уничтожением ранее
                // существующих данных
                out.append((char)oneByte); // запись с добавлением данных в конец
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        }
    }
}
