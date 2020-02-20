package com.asaitec.challenge.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    /**
     * Return each line of a file
     * @param   file    file object to read
     * @return  List    lines of the file
     */
    public static List<String> getLines(File file) {
        List<String> lines = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              lines.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            return null;
        }
        return lines;
    }
    
}
