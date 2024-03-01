package Lab5_FileSave;

import java.io.*;

public class FileSave {

    String fileName;

    public FileSave(String name)
    {
        fileName = name;
    }

    public void save(String line)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e)
        {
            System.out.println("Error reading file");
        }
    }

}
