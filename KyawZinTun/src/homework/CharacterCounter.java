package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCounter {
  public static void main(String[] args) {
      String filePath  = "D:\\My Exercise\\Day1\\input.txt";
;

      char targetChar = 'e';

     int count = 0;

     try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
          int character;
          while ((character = reader.read()) != -1) {
              if ((char) character == targetChar) {
                  count++;
              }
          }
          System.out.println("The character '" + targetChar + "' occurs " + count + " times.");
      } catch (IOException e) {
          System.out.println("Error reading file: " + e.getMessage());
      }
  }
}