package com.gurpreetsingh_C0784329;

public class String {
    public static void main(java.lang.String[] args){
        java.lang.String str = "hello hello how Are you HELLO are there happy test you";

        java.lang.String[] words=str.split(" ");
        int count=1;

        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].toLowerCase().equals(words[j].toLowerCase()))
                {
                    count=count+1;
                    words[j]="0";
                }
            }

            if(!words[i].equals("0")) {
                System.out.println(words[i].toLowerCase() + "->" + count);
            }
            count=1;
        }
    }
}
