import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            String direction = "";
            String North = "";
            String South = "";
            String West = "";
            String East = "";
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            //System.out.println(lightY>initialTy);
            if (lightY<initialTy) {
                initialTy--;
                North = "N";
                //System.out.println("yes");
            } else if (lightY>initialTy){
                initialTy++;
                South = "S";
                //System.out.println("yes");
            }
            if (lightX<initialTx) {
                initialTx--;
                West="W";
            } else if (lightX>initialTx) {
                initialTx++;
                East = "E";
            }
            direction = ""+North+South+West+East;
            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
}
