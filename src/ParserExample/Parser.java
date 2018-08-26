package ParserExample;


import java.io.InputStream;
import java.util.Properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Parser {

    private static String inputFilePath;

    private static String outputFilePath;

    private static String encoding;

    public static void main(String[] args) {
        InputStream is = Object.class.getResourceAsStream("/regexp.properties");
        Properties props = new Properties();
        try {
            //load properties
            props.load(is);
            String regexpString = props.getProperty("regexp");
            TextParser.setRegexp(regexpString);
            String maxBuffSize = props.getProperty("maxBufferSize");
            TextParser.setMAX_BUFF_SIZE(Integer.parseInt(maxBuffSize));
            inputFilePath = props.getProperty("inputFilePath");
            outputFilePath = props.getProperty("outPutFilePath");
            encoding = props.getProperty("encoding");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("no properties");
            System.exit(666);
        }
        BufferedReader breader;
        try {
            System.out.println("start work");
            //open file with name=inputFileName and with encoding=encoding
            breader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(inputFilePath), encoding));
            TextParser.textParsing(breader);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputFilePath), encoding));
            ParserUtil.GenerateReport(writer);
            System.out.println("complete work");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }

}