package tournament;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 * @author Kyle
 */
public class Records {

    private Scanner read;

    public void openFile(String UserName) {

        String name = (UserName = ".txt");

        try {
            read = new Scanner(new File(name));
        } catch (Exception e) {
            System.out.println("Could not find User");
        }
    }

    public void readFile() {
        while (read.hasNext()) {
            String a = read.next();
            String b = read.next();
            String c = read.next();
        }
    }

    public String numUsers() {
        try {
            read = new Scanner(new File("numUsers.txt"));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }

        String index = "NextUserNumber";
        String readIndex;
        String numUsers;
        readIndex = read.next();

        if (readIndex.equals(index)) {
            numUsers = read.next();
        } else {
            numUsers = "0";
        }

        return numUsers;
    }

    public String lookUpName(int playerNum) {

        try {
            read = new Scanner(new File("Usernames.txt"));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }

        String index = Integer.toString(playerNum);
        String readIndex;
        String username = "";

        while (read.hasNext()) {
            readIndex = read.next();
            if (readIndex.equals(index)) {
                username = read.next();
                break;
            } else {
                username = "";
            }
        }

        return username;
    }

}
