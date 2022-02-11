import java.util.Scanner;
import java.util.Random;

public class rockpaper{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n 0 for rock \n 1 for paper \n 2 for scissor");
        int input = sc.nextInt();

        Random r = new Random();
        int cinput = r.nextInt(03);

        if (input == cinput){
            System.out.println("Draw");
        }
        else if (input==0 && cinput == 2 || input==1 && cinput == 0 || input==2 && cinput == 1){
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer win");
        }
        System.out.print("Computer Choice :"+cinput);
    }
}