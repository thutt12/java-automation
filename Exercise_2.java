import java.io.*;


/*Write a program that uses a InputStreamReader and a OutputStreamWriter, to write and read text from the file. */
public class Exercise_2 {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("text.txt");
            OutputStreamWriter writer = new OutputStreamWriter(output);
            writer.write("Write a program that uses a InputStreamReader and a OutputStreamWriter");
            writer.close();

            FileInputStream input = new FileInputStream("text.txt");
            InputStreamReader reader = new InputStreamReader(input);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
