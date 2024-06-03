import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWritingExample {

    public static void main(String[] args) {

        String sourceFile = "dal.txt";
        String targetFile = "myNewFile.txt";
        Path myFile = Paths.get(sourceFile);

        List<String> content = new ArrayList();
        try {
            content = Files.readAllLines(myFile);
        } catch (IOException e) {
            System.err.println("File not found.");
            System.exit(1);
        }

        Path newPath = Paths.get(targetFile);
        try {
            Files.write(newPath, content);
            System.out.println("A new file has been created.");
        } catch (IOException e) {
            System.err.printf("Unable to write file: %s", targetFile);
            System.exit(2);
        }

    }
}
