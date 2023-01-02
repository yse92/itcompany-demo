package com.solvd.utils;
import com.solvd.exceptions.IncorrectFileNameException;
import java.io.IOException;
import static org.apache.commons.lang3.StringUtils.*;

public class StringCounter {
    public static void countWordMatches(String[] criterias, String FileInputName) throws IncorrectFileNameException, IOException {
        String result = "";
        String input = FilesUtil.readTextFile(FileInputName);
        for (String targetWord : criterias) {
            int count = countMatches(input, capitalize(targetWord)) + countMatches(input, uncapitalize(targetWord));
            result += count + " " + targetWord + "\n";
        }
        FilesUtil.writeToTextFile("src/main/resources/test3.txt", result);
    }
}
