package P_2019_2.Q_2;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;

public class HelperClass {
    public static void main(String[] args) {
        readLineToArray();
    }

    public static void readLineToArray(){

        LinkedList <String> array=new LinkedList<>();

        try {
            BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Isuru sandaruwan\\Desktop\\pastpaper\\MySolutions\\src\\P_2019_2\\Q_2\\data.txt"));

            String line;
            while((line=reader.readLine())!=null){
                String changes = line.replaceAll("[\\n\\r\\t]","");
                array.add(changes);
            }
            System.out.println(array);

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static TAG_TYPE getTagType(String string){
        String[] opening = {"pdnml","table","metadata","thead","tbody","row","group","item","tablename","tableid"};
        String[] closing = {"/pdnml","/table","/metadata","/thead","/tbody","/row","/group","/item","/tablename","/tableid"};

        String tag=string.split(",")[0];

        boolean isOpening= Arrays.asList(opening).contains(tag);
        if(isOpening){
            return TAG_TYPE.opening;
        }
        boolean isClosing= Arrays.asList(closing).contains(tag);
        if(isClosing){
            return TAG_TYPE.closing;
        }
        return TAG_TYPE.content;
    }


}
