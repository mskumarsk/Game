package Game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
     Game game=new Game();
     game.game();
    }
    public void game(){
        System.out.println("=============================>> GAME <<=============================");
        System.out.println("[    O -> Computer   |   X -> Player    ]");
        System.out.println("Toss...");
        System.out.println("[    0 -> HEAD       |   1 -> TAIL      ]");
        System.out.println("Enter the number:");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        int toss=(int)Math.floor(Math.random()*2);
        System.out.println(toss);
        PlayGame playGame=new PlayGame();


        while (true){
            if (choose==toss){
                System.out.println("Computer win the toss...");

            }else {
                System.out.println("You win the toss...");
            }
        }

//        Random random=new Random();
//        int randomNumber=random.nextInt(9)+1;

    }
}
