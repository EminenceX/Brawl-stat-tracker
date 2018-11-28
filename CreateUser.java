package tournament;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 *
 * @author Kyle
 */
public class CreateUser {

    private Formatter ptf;
    private Scanner read;
    Records r = new Records();

    public void CreateUser(String userName) {

        String name = (userName + ".txt");

        File folder = new File("C:\\Users\\Kyle\\Documents"
                + "\\NetBeansProjects\\Tournament\\Users\\" + userName);
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Folder created");
            } else {
                System.out.println("Failed");
            }
        }

        try {
            ptf = new Formatter(folder + "\\" + name);
        } catch (Exception e) {
            System.out.println("you have an error");
        }

    }

    public void defaultProfile(String userName) {
        ptf.format("%s%s", "username ", userName);
        ptf.format("\n%s%s", "wins ", 0);
        ptf.format("\n%s%s", "loses ", 0);
    }

    public void createCharFiles(String userName) {
        File location = new File("C:\\Users\\Kyle\\Documents"
                + "\\NetBeansProjects\\Tournament\\Users\\" + userName);

        try {
            read = new Scanner(new File("charList.txt"));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }

        String txt = "wins 0 \nloses 0";
        while (read.hasNext()) {
            String name = read.next() + ".txt";

            try {

                ptf = new Formatter(location + "\\" + name);
            } catch (Exception e) {
                System.out.println("you have an error");
            }

            try {
                File f = new File(location + "\\" + name);
                overWrite(txt, f);
            } catch (Exception e) {
            }
        }
    }

    public void addUsername(String userName) {

        String numUsers = r.numUsers();

        try {
            File f = new File("Usernames.txt");
            Append("\n" + numUsers + " " + userName, f);
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        updateNextUserNumber(numUsers);
    }

    public void updateNextUserNumber(String numUsersString) {
        int numUsersInt;

        numUsersInt = Integer.valueOf(numUsersString);
        numUsersInt++;
        try {
            File f = new File("numUsers.txt");
            overWrite("NextUserNumber " + numUsersInt, f);
        } catch (Exception e) {
        }

    }

    public void overWrite(String s, File f) throws IOException {

        FileWriter fw = new FileWriter(f);
        fw.write(s);
        fw.close();
    }

    //Appends text file
    public void Append(String s, File f) throws IOException {
        FileWriter fw = new FileWriter(f, true);
        fw.write(s);
        fw.close();
    }

    public void closeFile() {
        ptf.close();
    }
}
