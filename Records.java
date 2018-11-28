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
    private Formatter ptf;

    public void openFile(String UserName) {

        String name = (UserName = ".txt");

        try {
            read = new Scanner(new File(name));
        } catch (Exception e) {
            System.out.println("Could not find User");
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

    public String lookUpValue(String username, String value) {
        String file
                = ("C:\\Users\\Kyle\\Documents\\NetBeansProjects\\"
                + "Tournament\\Users\\" + username + "\\" + username + ".txt");

        try {
            read = new Scanner(new File(file));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }

        String index = value;
        String readIndex;
        String num = "";

        while (read.hasNext()) {
            readIndex = read.next();
            if (readIndex.equals(index)) {
                num = read.next();
                break;
            } else {
                num = "";
            }
        }
        return num;
    }
    
    public String lookUpCharValue(String username, String charValue, String value) {
        String file
                = ("C:\\Users\\Kyle\\Documents\\NetBeansProjects\\"
                + "Tournament\\Users\\" + username + "\\" + charValue + ".txt");

        try {
            read = new Scanner(new File(file));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }

        String index = value;
        String readIndex;
        String num = "";

        while (read.hasNext()) {
            readIndex = read.next();
            if (readIndex.equals(index)) {
                num = read.next();
                break;
            } else {
                num = "";
            }
        }
        return num;
    }
    
    
    public void increaseWins(String userName, String charValue) {

        CreateUser cu = new CreateUser();
        
        //increase total wins in userName.txt
        String userFile
                = ("C:\\Users\\Kyle\\Documents\\NetBeansProjects\\"
                + "Tournament\\Users\\" + userName + "\\" + userName + ".txt");

        try {
            read = new Scanner(new File(userFile));
        } catch (Exception e) {
            System.out.println("username error");
        }

        int wins = Integer.parseInt(lookUpValue(userName, "wins"));
        int loses = Integer.parseInt(lookUpValue(userName, "loses"));

        wins++;

        try {
            File f = new File(userFile);
            cu.overWrite("username " + userName 
                    + "\nwins " + wins + "\nloses " + loses, f);
        } catch (Exception e) {
        }
        
        //increase char wins in charValue.txt
        String charFile
                = ("C:\\Users\\Kyle\\Documents\\NetBeansProjects\\"
                + "Tournament\\Users\\" + userName + "\\" + charValue + ".txt");
        
        try {
            read = new Scanner(new File(charFile));
        } catch (Exception e) {
            System.out.println("character value error");
        }
        
        int charWins = Integer.parseInt(
                lookUpCharValue(userName, charValue, "wins"));
        int charLoses = Integer.parseInt(
                lookUpCharValue(userName, charValue, "loses"));
        
        charWins++;

        try {
            File f = new File(charFile);
            cu.overWrite("wins " + charWins + "\nloses " + charLoses, f);
        } catch (Exception e) {
        }
    }
    
    public void increaseLoss(String userName, String charValue) {

        CreateUser cu = new CreateUser();
        
        //increase total wins in userName.txt
        String userFile
                = ("C:\\Users\\Kyle\\Documents\\NetBeansProjects\\"
                + "Tournament\\Users\\" + userName + "\\" + userName + ".txt");

        try {
            read = new Scanner(new File(userFile));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }

        int wins = Integer.parseInt(lookUpValue(userName, "wins"));
        int loses = Integer.parseInt(lookUpValue(userName, "loses"));

        loses++;

        try {
            File f = new File(userFile);
            cu.overWrite("username " + userName 
                    + "\nwins " + wins + "\nloses " + loses, f);
        } catch (Exception e) {
        }
        
        //increase char wins in charValue.txt
        String charFile
                = ("C:\\Users\\Kyle\\Documents\\NetBeansProjects\\"
                + "Tournament\\Users\\" + userName + "\\" + charValue + ".txt");
        
        try {
            read = new Scanner(new File(charFile));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }
        
        int charWins = Integer.parseInt(
                lookUpCharValue(userName, charValue, "wins"));
        int charLoses = Integer.parseInt(
                lookUpCharValue(userName, charValue, "loses"));
        
        charLoses++;

        try {
            File f = new File(charFile);
            cu.overWrite("wins " + charWins + "\nloses " + charLoses, f);
        } catch (Exception e) {
        }
    }

}
