package SOLID1;

import java.io.*;


public class Logger {

    String fileName = "LoggerFile";

    public Logger() {
        this.fileName = fileName;
    }

    File file;
    {
        try {
            file = new File(this.fileName);

            if (!file.exists()){
                file.createNewFile();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    FileWriter fileWriter;
    {
        try {
            fileWriter = new FileWriter(this.file, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    FileReader fileReader;
//
//    {
//        try {
//            fileReader = new FileReader(this.fileName);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
    BufferedReader reader;

    {
        try {
            reader = new BufferedReader(new FileReader(this.fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void loggerWriter(String message){
         try {
            fileWriter.write(message);
            fileWriter.append("\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getLogger() throws IOException {
        fileWriter.flush();
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            // read next line
            line = reader.readLine();
        }
        reader.close();
    }

}
