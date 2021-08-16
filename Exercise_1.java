import java.io.*;

/*Write a program that uses a FileReader and a FileWriter to copy text from the file named. */
public class Exercise_1 {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("MyFile.txt");
            FileWriter wr = new FileWriter("DestFile.txt");
            int character;
            while ((character = reader.read()) != -1) {
                wr.write(character);
            }
            wr.close();
            reader.close();

            FileReader des = new FileReader("DestFile.txt");
            int c;
            while ((c = des.read()) != -1) {
                System.out.print((char) c);
            }
            des.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
