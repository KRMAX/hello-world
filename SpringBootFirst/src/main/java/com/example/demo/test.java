package com.example.demo;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        test test=new test();
 /*    int[][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

     StringBuffer str=new StringBuffer();
        str.append("Hellow World");
        System.out.println(test.replaceSpace(str));*/
    }
    public boolean Find(int target, int [][] array) {
        boolean flag=false;
        ok:for(int i=array.length-1;i>0;i--){
            for(int j=array[i].length-1;j>0;j--){
                if(array[i][j]==target){
                    flag=true;
                    break ok;
                }
            }
        }
        return flag;
    }

    public String replaceSpace(StringBuffer str) {
     /*   String a=String.valueOf(str).replace(" ","%20");
        return a;*/
     int length=str.length();
     StringBuffer newStr=new StringBuffer();
     for(int i=0;i<length;i++){
         if(!String.valueOf(str.charAt(i)).equals(" ")){
             newStr.append(str.charAt(i));
         }else{
             newStr.append("%20");
         }
     }
     return newStr.toString();
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       return null;
    }











}
