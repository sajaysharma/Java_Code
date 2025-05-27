import java.io.*;


public class Experiment_19 {
    public static void main(String[] args) {
        try {
            // Write to source file
            FileWriter writer = new FileWriter("source.txt");
            writer.write("Hello, this is sample content.");
            writer.close();

            // Read from source and write to destination
            FileReader reader = new FileReader("source.txt");
            FileWriter copyWriter = new FileWriter("destination.txt");

            int ch;
            while ((ch = reader.read()) != -1) {
                copyWriter.write(ch);
            }

            reader.close();
            copyWriter.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
