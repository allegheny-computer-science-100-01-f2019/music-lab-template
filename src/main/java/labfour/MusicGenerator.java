package labfour;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
* This class allow the user to play different pieces of music.
*/
public class MusicGenerator {

  /** The main method allows for user input,
  * then it plays the music selected by the user.
  */
  public static void main(String[] args) {

    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date());
    System.out.println("Welcome to gloomy tunes!");
    // declare the starting file and scanner
    File inputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      inputFile = new File("input/user_inputs.txt");
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }

    //Read in an instrument and the tempo from the text file
    String instrument = scanner.next();
    String tempo = scanner.next();

    // declare the starting file and scanner
    File musicFile = null;
    // connect the scanner to the input file
    try {
      musicFile = new File("input/music_inputs.txt");
      scanner = new Scanner(musicFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }

    // read in musical pieces from the text file
    String music1 = scanner.nextLine();
    String music2 = scanner.nextLine();
    String music3 = scanner.nextLine();
    String music4 = scanner.nextLine();

    // generate patterns
    String userChoice = "I[" + instrument + "] T[" + tempo + "] ";
    Pattern piece1 = new Pattern();
    // randomly create a piece for music strings
    Random random = new Random();
    int randomNumber = random.nextInt(2);
    System.out.println("Random number is: " + randomNumber);
    piece1.add(userChoice);
    if (randomNumber == 0) {
      piece1.add(music4).add(music2);
      piece1.add(music1).add(music3);
    } else {
      piece1.add(music4).add(music3);
      piece1.add(music2).add(music1);
    }

    String music5 = scanner.nextLine();
    String music6 = scanner.nextLine();
    
    Pattern piece2 = new Pattern();
    piece2.add(userChoice);
    piece2.add(music5);
    piece2.add(music6, 2);

    piece2.repeat(2);

    Pattern piece3 = new Pattern();
    piece3.add(userChoice);
    piece3.add(music1);
    piece3.add(music2).add(music3);
    piece3.add(music4);
    piece3.repeat(2);

    // randomly select a number
    randomNumber = random.nextInt(3);
    System.out.println("Random number is: " + randomNumber);

    System.out.println("Instantiating the player.");
    Player player = new Player();
    System.out.println("Instantiating the pattern 1.");
    if (randomNumber == 0) {
      System.out.println("Playing the pattern 1.");
      player.play(piece1);
      System.out.println("Done playing the pattern 1.");
    } else if (randomNumber == 1) {
      System.out.println("Playing the pattern 2.");
      player.play(piece2);
      System.out.println("Done playing the pattern 2.");
    } else if (randomNumber == 2) {
      System.out.println("Playing the pattern 3.");
      player.play(piece3);
      System.out.println("Done playing the pattern 3.");
    }
  }

}
