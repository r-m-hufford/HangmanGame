package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

public class Hangman {

    public void main() {

    }

    public Boolean countDown(int i) {
        int counter = i;
        boolean counterEmpty = false;

        while (counter != 0) {
            System.out.println("FART!");
            counter--;
        }
        if (counter == 0) {
            counterEmpty = true;
        }

        return counterEmpty;
    }



}
