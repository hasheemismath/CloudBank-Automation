package utils;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;


public class CSVReadWrite {
   // private static final String FILE_PATH = "C:\\Users\\Aushadhee-PC\\Documents\\CloudBankProject\\Automation Project\\CloudBnq\\DataSet.csv";

    public CSVReader readfile (String filePath) throws Exception {
        FileReader fileReader = new FileReader(filePath);
        return new CSVReader(fileReader);
    }
}

