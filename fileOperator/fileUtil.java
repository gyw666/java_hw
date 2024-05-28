package fileOperator;

import java.io.*;


public class fileUtil {





    public static boolean fileWrite(String fileName, String content) {
        File writeName = new File(fileName);
        try {
            writeName.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(writeName));
            out.write(content);
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public static String fileRead(String pathName) {
        File fileName = new File(pathName);
        String line = "";
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(fileName));
            BufferedReader br = new BufferedReader(reader);

            String tempLine="";
            while (tempLine != null) {
                tempLine = br.readLine();
                if (tempLine != null) {
                    line += tempLine;
                    line += "\n";
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }


}

