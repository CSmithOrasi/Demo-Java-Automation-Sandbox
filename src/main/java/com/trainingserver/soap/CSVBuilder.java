package com.trainingserver.soap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVBuilder {

    public static void main(String[] args) throws IOException {
        writeCSV("GetAllActors", 205);
    }

    private static void writeCSV(String scenario, int numResults) throws IOException {
        String path = "C:\\Users\\christopher.smith\\repos\\Demo-Java-Automation\\src\\main\\resources\\excelsheets\\trainingServer\\" + scenario + ".csv";
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        // Write header
        writer.write(scenario + ",xpath,value\n");
        // For each node within a given range, write an xpath and regex
        for (int i = 1; i <= numResults; i++) {
            writer.write(",Envelope/Body/" + decapitalize(scenario) + "Response/actor[" + i + "]/actor_id,\\d+\r\n");
            writer.write(",Envelope/Body/" + decapitalize(scenario) + "Response/actor[" + i + "]/first_name,[\\w-]+\\s*\r\n");
            writer.write(",Envelope/Body/" + decapitalize(scenario) + "Response/actor[" + i + "]/last_name,[\\w-]+\\s*\r\n");
        }
        writer.close();
    }

    private static String decapitalize(String string) {
        return string.substring(0, 1).toLowerCase() + string.substring(1);
    }
}
