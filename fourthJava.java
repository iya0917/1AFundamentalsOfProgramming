import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fourthJava {
    public static void main(String[] args) {
    // The name or path of the file you want to create or overwrite.
    String filePath = "output.txt";
    // Wrap a File Writer inside a BufferedWriter
    // The try-with-resources block ensures the file is closed and saved automatically.
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        // Write next to the file
        writer.write("This is the first line of the text.");
        // newLine() adds a line break. It automatically uses the correct
        // line ending for our operating system (Windows vs. Mac/Linux).
        writer.newLine();
        writer.write("This is the second line of text.");
        writer.newLine();
        writer.write("BufferedWriter makes writing fast and efficient.");
        System.out.println("Data successfully written to the file!");
    }
    catch (IOException e) {
        System.err.println("An error occured while writing to the file.");
        e.printStackTrace();
    }
}}
