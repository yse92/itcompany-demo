package com.solvd.utils;

import com.solvd.exceptions.IncorrectFileNameException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesUtil<T> {
    public static String readTextFile(String fileName) throws IOException, IncorrectFileNameException {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            return content;
        } catch (FileNotFoundException e) {
            throw new IncorrectFileNameException("Incorrect filename: " + fileName + "\n", e);
        }
    }

    public static void writeToTextFile(String fileName, String content) throws IOException, IncorrectFileNameException {
        try {
            Path write = Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
        } catch (FileNotFoundException e) {
            throw new IncorrectFileNameException("Incorrect filename: " + fileName + "\n", e);
        }
    }

}
