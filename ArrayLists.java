import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayLists{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<ArrayList> main=new ArrayList<ArrayList>();
        for(int i=0;i<n;i++){
            int n1=s.nextInt();
            ArrayList<Integer> lis=new ArrayList<>();
            lis.add(n1);
            for(int j=0;j<n1;j++){
                lis.add(s.nextInt());
            }
            main.add(lis);
        }
        int n2=s.nextInt();
        for(int i=0;i<n2;i++){
            int x=s.nextInt()-1;
            int y=s.nextInt()-1;
            if(x<n&& y<main.get(x).size()){
                System.out.println(main.get(x).get(y));

            }
            else{
                System.out.println("Error..!");
            }
        }
    }
}