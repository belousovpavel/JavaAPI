package lesson2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileSystem {
    public static void main(String[] args) throws IOException {

//        Создание файла и запись в него какой-то информации

        Path path = Path.of("new_file.txt");
        if (Files.notExists(path)){
            Files.createFile(path);
        }

        try(OutputStream os = Files.newOutputStream(path)){
            String output = "output content";
            byte[] bytes = output.getBytes();
            os.write(bytes);
        }

//        System.out.println(Files.isRegularFile(path)); // существует ли такой файл

//        InputStream inputStream = Files.newInputStream(path);
//
//        Scanner scanner = new Scanner(inputStream); //читает 4 строки в файле
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//
//        byte[] allBytes = inputStream.readAllBytes(); // читает все байты
//        byte[] forRead = new byte[24];
//        inputStream.read(forRead,10,23);
//
//        System.out.println(new String(allBytes));
//        inputStream.close();
//        scanner.close();

//        InputStream
//        прверяемые и непроверяемые (checked and unchecked)
//        Непроверяемое
//        int[] arr ={1,2};
//        System.out.println(arr[10]);
//        Проверяемое, нужно try,catch
//        InputStream inputStream = null;
//        try {
//            inputStream = Files.newInputStream(path);
//            byte[] allBytes = inputStream.readAllBytes();
//            System.out.println(new String(allBytes));
//        } catch (IOException e) {
//            System.out.println("Произошла ошибка" + e.getClass() + " " + e.getMessage());
//        } finally {
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                }catch (IOException e){
//                    //ignore
//                }
//            }
//        }

//        Так правильно записывать

//        try (InputStream inputStream = Files.newInputStream(path)){
//            byte[] allBytes = inputStream.readAllBytes();
//            System.out.println(new String(allBytes));
//        }catch (IOException e){
//            System.out.println("Произошла ошибка" + e.getClass() + " " + e.getMessage());
//        }

    }


}
