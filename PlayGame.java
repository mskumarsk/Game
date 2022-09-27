package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args){

        PlayGame playGame=new PlayGame();
        playGame.m();
    }
    public void m(){
        String[][] array={{"   "," | ","   "," | ","   "},
                {"---","-+-","---","-+-","---"},
                {"   "," | ","   "," | ","   "},
                {"---","-+-","---","-+-","---"},
                {"   "," | ","   "," | ","   "}};

        int[] computer=new int[5];
        int[] player=new int[5];
        int playerInput=0;
        int computerInput=0;
        String symbol="";
        while (true) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
            System.out.println("Enter the number (1-9) :");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            boolean tf=checkNumber(number,computer,player);
            if (tf){
                player[playerInput]=number;
                symbol=" X ";
                addToArray(array,number,symbol);
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }

                Random random=new Random();
                int randomNumber=random.nextInt(9)+1;


            }else {
                System.out.println("This number already exists...");
            }

        }
    }
    public boolean checkNumber(int number,int[] computer,int[] player){
        for (int i=0;i<computer.length;i++){
            if (number==computer[i]){
                return false;
            }
        }
        for (int i=0;i< player.length;i++){
            if (number==player[i]){
                return false;
            }
        }
        return true;
    }

    public void addToArray(String[][] array,int number,String symbol){
        if (number==1){
            array[0][0]=symbol;
        }else if (number==2){
            array[0][2]=symbol;
        }
        else if (number==3){
            array[0][4]=symbol;
        }
        else if (number==4){
            array[1][0]=symbol;
        }
        else if (number==5){
            array[1][2]=symbol;
        }
        else if (number==6){
            array[1][4]=symbol;
        }
        else if (number==7){
            array[2][0]=symbol;
        }
        else if (number==8){
            array[2][2]=symbol;
        }
        else if (number==9){
            array[2][4]=symbol;
        }
    }

    public void check(){
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("123");
        arrayList.add("456");
        arrayList.add("789");
        arrayList.add("147");
        arrayList.add("258");
        arrayList.add("369");
        arrayList.add("159");
        arrayList.add("357");

        for (int i=0;i<arrayList.size();i++){
            String string=arrayList.get(i);
            for (int j=0;j<string.length();j++) {
                int number = Integer.parseInt(String.valueOf(string.charAt(j)));

            }
        }


    }
}
