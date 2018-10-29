package minesweeper;

import java.util.Scanner;

public class MineSweeper {

    public static char[][] chuyenDoi(char[][] map){
        char[][] array = new char[map.length][map[0].length];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]=='*'){
                    array[i][j]='*';
                }
                else{  
                    if(i==0){
                        if(j==0){
                            int count = 0;
                            if(map[i+1][j]=='*') count++;
                            if(map[i][j+1]=='*') count++;
                            if(map[i+1][j+1]=='*') count++;
                            array[i][j]=(char)(count+48); 
                        }
                        else if(j==map[0].length-1){
                            int count=0;
                            if(map[i][j-1]=='*') count++;
                            if(map[i+1][j]=='*') count++;
                            if(map[i+1][j-1]=='*') count++;
                            array[i][j]=(char)(count+48); 
                        }
                        else{
                            int count=0;
                            if(map[i][j-1]=='*') count++;
                            if(map[i][j+1]=='*') count++;
                            if(map[i+1][j-1]=='*') count++;
                            if(map[i+1][j]=='*') count++;
                            if(map[i+1][j+1]=='*') count++;
                            array[i][j]=(char)(count+48); 
                        }
                    }
                    else if(i==map.length-1){
                        if(j==0){
                            int count = 0;
                            if(map[i-1][j]=='*') count++;
                            if(map[i][j+1]=='*') count++;
                            if(map[i-1][j+1]=='*') count++;
                            array[i][j]=(char)(count+48); 
                        }
                        else if(j==map[0].length-1){
                            int count=0;
                            if(map[i][j-1]=='*') count++;
                            if(map[i-1][j]=='*') count++;
                            if(map[i-1][j-1]=='*') count++;
                            array[i][j]=(char)(count+48); 
                        }
                        else{
                            int count=0;
                            if(map[i][j-1]=='*') count++;
                            if(map[i][j+1]=='*') count++;
                            if(map[i-1][j-1]=='*') count++;
                            if(map[i-1][j]=='*') count++;
                            if(map[i-1][j+1]=='*') count++;
                            array[i][j]=(char)(count+48); 
                        }                        
                    }
                    else{
                        if(j!=0 && j!=map[0].length-1){
                            int count=0;
                            if(map[i-1][j-1]=='*') count++;
                            if(map[i-1][j]=='*') count++;
                            if(map[i-1][j+1]=='*') count++;
                            if(map[i][j-1]=='*') count++;
                            if(map[i][j+1]=='*') count++;
                            if(map[i+1][j-1]=='*') count++;
                            if(map[i+1][j]=='*') count++;
                            if(map[i+1][j+1]=='*') count++;
                            array[i][j]=(char)(count+48);                               
                        }
                        else if(j==0){
                            int count=0;
                            if(map[i-1][j]=='*') count++;
                            if(map[i-1][j+1]=='*') count++;
                            if(map[i][j+1]=='*') count++;
                            if(map[i+1][j+1]=='*') count++;
                            if(map[i+1][j]=='*') count++;
                            array[i][j]=(char)(count+48);
                        }
                        else if(j==map[0].length-1){
                            int count=0;
                            if(map[i-1][j]=='*') count++;
                            if(map[i-1][j-1]=='*') count++;
                            if(map[i][j-1]=='*') count++;
                            if(map[i+1][j-1]=='*') count++;
                            if(map[i+1][j]=='*') count++;  
                            array[i][j]=(char)(count+48);
                        }
                    }
                }
            }         
        }
        return array;
    }
    
    public static void main(String[] args) {
        int width, heigh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width=sc.nextInt();
        System.out.println("Enter the heigh: ");
        heigh=sc.nextInt();
        char[][] map=new char[width][heigh];
        for(int i=0;i<width;i++){
            for(int j=0;j<heigh;j++){
                if(Math.random()<0.3) map[i][j]='*';
                else map[i][j]='.';
            }
        }
        
        map=chuyenDoi(map);
        
        for(char[]a : map){
            for(char x : a){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
    
}
