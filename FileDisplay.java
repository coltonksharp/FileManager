package Lab5_FileSave;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplay {

    String fileName;

    public FileDisplay(String name)
    {
        fileName = name;
    }

    public void display()
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("This files does not exist.");
        }
    }

    public void display(int n)
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int numLine = 0;
            String line;
            while ((line = reader.readLine()) != null && numLine < n) {
                System.out.println(line);
                numLine++;
            }
        } catch (IOException e) {
            System.out.println("This files does not exist.");
        }
    }

    public void display(int from, int to)
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int numLine = 1;
            String line;
            while ((line = reader.readLine()) != null && numLine <= to) {
                if (numLine >= from)
                {
                    System.out.println(line);
                }
                numLine++;
            }
        } catch (IOException e) {
            System.out.println("This files does not exist.");
        }
    }



}
