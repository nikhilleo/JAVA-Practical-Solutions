import java.io.*;

class Demo {
    public static void main(String[] args) throws Exception {
        int ch, n = 0, i = 0, b;
        FileInputStream fin = new FileInputStream("abc.txt");
        while ((ch = fin.read()) != -1) {
            n = n + 1;
            // System.out.println((char)ch);
        }
        char str[] = new char[n];
        fin.close();
        FileInputStream fin1 = new FileInputStream("abc.txt");
        while ((b = fin1.read()) != -1) {
            str[i] = (char) b;
            i++;
        }
        for (i = n - 1; i >= 0; i--) {
            System.out.print(str[i]);
        }
        fin.close();
    }
}
