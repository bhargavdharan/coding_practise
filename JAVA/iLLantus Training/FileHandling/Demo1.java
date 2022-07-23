import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

class CreateFile {
    public static void main(String[] args) {
        File f0 = new File("../Files/demo.txt");
        try {
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully");
            } else {
                System.out.println("File already exist in the directory");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("An unexpected error is occurred");
            e.printStackTrace();
        }
    }
}

class FileInfo {
    public static void main(String[] args) {
        File f0 = new File("../Files/demo.txt");
        if (f0.exists()) {
            System.out.println("The name of the file is : " + f0.getName());
            System.out.println("The path of this file is : " + f0.getPath());
            System.out.println("Is File writable ? : " + f0.canWrite());
            System.out.println("Is File readable ? : " + f0.canRead());
            System.out.println("The size of the file in bytes is : " + f0.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fWrite = new FileWriter("../Files/demo.txt");
            fWrite.write("A named location used to store related information");
            fWrite.close();
            System.out.println("A named location used to store related information");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
}