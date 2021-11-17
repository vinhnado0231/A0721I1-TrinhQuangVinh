package ss17_io_binary_file_and_serailization.bai_tap;
//Tham Khao
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.Scanner;


public class CopyBinaryFile {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Source file input: ");
//        String strSourceFile=scanner.nextLine();
//        System.out.println("\nSource file output: ");
//        String strDestinationFile= scanner.nextLine();
        String strSourceFile="src/ss17_io_binary_file_and_serailization/bai_tap/data.bin";
        String strDestinationFile="dataCopy.bin";
        try {            FileInputStream fin = new FileInputStream(strSourceFile);
            FileOutputStream fout = new FileOutputStream(strDestinationFile);

            byte[] b = new byte[1024];
            int noOfBytes = 0;
            System.out.println("Copying file using streams");
            while ((noOfBytes = fin.read(b)) != -1) {
                fout.write(b, 0, noOfBytes);
            }
            System.out.println("File copied!");
            fin.close();
            fout.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("Specified file not found :" + fnf);
        } catch (IOException ioe) {
            System.out.println("Error while copying file :" + ioe);
        }
    }
}
