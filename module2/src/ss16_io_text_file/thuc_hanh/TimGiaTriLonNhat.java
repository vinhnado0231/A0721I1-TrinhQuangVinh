package ss16_io_text_file.thuc_hanh;

import java.util.List;

import static ss16_io_text_file.thuc_hanh.ReadAndWriteFile.findMax;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Files\\A0721I1-TrinhQuangVinh\\module2\\src\\ss16_io_text_file\\input.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}
