package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String s1="",s2="";
        try(FileWriter writer = new FileWriter("A.txt", false)){
            String text = " plumb bed climb armchair bread proverb ";
            s1=text;
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        int count =0;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)==' '){
                for (int j=i+1;j<s1.length();j++){
                    if (s1.charAt(j)==' ' && s1.charAt(j-1)=='b') {  //for(int h=i;h<=j;h++){s2+=s1.charAt(h);}break;}
                       count++;
                    }
                    else if(s1.charAt(j)==' ' && s1.charAt(j-1)!='b') break;
                }
            }
        }
        System.out.print(count);
    }
}
