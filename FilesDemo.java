package Lab5_FileSave;

public class FilesDemo {
    public static void main(String[] args)
    {
        FileSave saveFile = new FileSave("lines.txt");

        saveFile.save("1-Lorem ipsum dolor sit amet");
        saveFile.save("2-Consectetuer adipiscing elit");
        saveFile.save("3-Sed diam nonummy nibh euismod tincidunt");
        saveFile.save("4-Ut wisi enim ad minim veniam");
        saveFile.save("5-Quis nostrud exerci tation ullamcorper");
        saveFile.save("6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat");
        saveFile.save("7-Duis autem vel eum iriure dolor in hendrerit");
        saveFile.save("8-Vel illum dolore eu feugiat nulla facilisis at vero eros");

        FileDisplay displayFile = new FileDisplay("lines.txt");

        System.out.println("Displaying lines:");
        displayFile.display();

        System.out.println("\nDisplaying the first 3 lines:");
        displayFile.display(3);

        System.out.println("\nDisplaying lines 3 to 5:");
        displayFile.display(3,5);

    }

}
