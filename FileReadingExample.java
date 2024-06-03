import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReadingExample {

    public static void main(String[] args) {
        /* String filePathAndName = "./out/resources/my-file.txt"; */
        /* String filePathAndName = "my-file.txt"; */
        String filePathAndName = "log.txt";
        List<String> fileContent = readFileContent(filePathAndName);
        printFileContent(fileContent);
    }

    public static List<String> readFileContent(String filePathAndName) {
        List<String> content = new ArrayList<>();
        Path filePath = Paths.get(filePathAndName);
        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("File not found.");
            System.exit(1);
        }
        return content;
    }

    public static void printFileContent(List<String> content) {
        for (String line: content) {
            /* if (line.contains("GET")) {
                System.out.println(line);
            } */
            /* if (line.contains("POST")) {
                System.out.println(line);
            } */
            if (line.contains("29.11.80.12")) {
                System.out.println(line);
            }
        }
    }
}
