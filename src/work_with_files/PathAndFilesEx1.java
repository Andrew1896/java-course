package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("text15.txt");
        Path directoryPath = Paths.get("C:\\Users\\ionla\\OneDrive\\Рабочий стол\\M");
        Path anotherPath = Paths.get("C:\\Users\\ionla\\OneDrive\\Рабочий стол\\M\\N\\Z//test20.txt");
        Path filePath2 = Paths.get("C:\\Users\\ionla\\IdeaProjects\\java-course\\text15.txt");

        System.out.println("filePath.getFileName: " + filePath.getFileName());
        System.out.println("directoruPath.getFileName: " + directoryPath.getFileName());
        System.out.println("--------------------------");

        System.out.println("filePath.getParent: " + filePath.getParent());
        System.out.println("directoruPath.getParent: " + directoryPath.getParent());
        System.out.println("--------------------------");

        System.out.println("filePath.getRoot: " + filePath.getRoot());
        System.out.println("directoruPath.getRoot: " + directoryPath.getRoot());
        System.out.println("--------------------------");

        System.out.println("filePath.isAbsolute: " + filePath.isAbsolute());
        System.out.println("directoruPath.isAbsolute: " + directoryPath.isAbsolute());
        System.out.println("--------------------------");

        System.out.println("filePath.toAbsolutePath: " + filePath.toAbsolutePath());
        System.out.println("directoruPath.toAbsolutePath: " + directoryPath.toAbsolutePath());
        System.out.println("--------------------------");

        System.out.println("filePath.toAbsolutePath().getParent(): " + filePath.toAbsolutePath().getParent());
        System.out.println("filePath.toAbsolutePath().getRoot(): " + filePath.toAbsolutePath().getRoot());
        System.out.println("--------------------------");

        System.out.println("directoryPath.resolve(filePath): " + directoryPath.resolve(filePath));
        System.out.println("--------------------------");

        System.out.println("directoryPath.relativize(anotherPath): " + directoryPath.relativize(anotherPath));
        System.out.println("--------------------------");

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }
        System.out.println("Files.isReadable(filePath): " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath): " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath): " + Files.isExecutable(filePath));
        System.out.println("--------------------------");

        System.out.println("Files.isSameFile(filePath, filePath2): " + Files.isSameFile(filePath, filePath2));
        System.out.println("--------------------------");

        System.out.println("Files.size(filePath): " + Files.size(filePath));
        System.out.println("--------------------------");

        System.out.println("Files.getAttribute(filePath, \"creationTime\"): " + Files.getAttribute(filePath, "creationTime"));
        System.out.println("--------------------------");

        System.out.println("Files.getAttribute(filePath, \"size\"): " + Files.getAttribute(filePath, "size"));
        System.out.println("--------------------------");

        Map<String, Object> atributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry: atributes.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
