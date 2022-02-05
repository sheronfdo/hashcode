/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaProb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author Jamit
 */
public class PizzaProb {

    private static int clientsCount = 0;
    private int likePreferences = 0;
    private int dislikePreferences = 0;
    private static ArrayList<String> likeArray;
    private static ArrayList<String> dislikeArray;
    static File myObj;

    public static void main(String[] args) {
        likeArray = new ArrayList<String>();
        dislikeArray = new ArrayList<String>();
        openFile();
        likeArray = removeRepeat(likeArray);
        dislikeArray = removeRepeat(dislikeArray);
        System.out.println("\n");
        System.out.println("\n");
        likeArray = removeDislike(likeArray, dislikeArray);
        readArray(likeArray);
        

    }

    private static void openFile() {
        try {
            myObj = new File("a_an_example.in.txt");
            Scanner myReader = new Scanner(myObj);
            int n = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                n++;
                if (n == 1) {
                    clientsCount = Integer.parseInt(data.split(" ")[0]);
                } else if (n % 2 == 0) {
                    String arr[] = data.split(" ");
                    for (int i = 1; i < Integer.parseInt(arr[0]) + 1; i++) {
                        likeArray.add(arr[i]);
                    }
                } else if (n % 2 == 1) {
                    String arr[] = data.split(" ");
                    for (int i = 1; i < Integer.parseInt(arr[0]) + 1; i++) {
                        dislikeArray.add(arr[i]);
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PizzaProb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static ArrayList removeRepeat(ArrayList list) {
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            String pref = list.get(i).toString();
            for (int j = i + 1; j < listSize; j++) {
                if (pref.equals(list.get(j))) {
                    list.remove(j);
                    listSize = list.size();
                    j--;
                }
            }
        }
        return list;
    }

    private static ArrayList removeDislike(ArrayList like, ArrayList dislike) {
        int likeSize = like.size();
        int dislikeSize = dislike.size();
        for (int i = 0; i < dislikeSize; i++) {
            String dislikePref = dislike.get(i).toString();
            for (int j = 0; j < likeSize; j++) {
                if (dislikePref.equals(like.get(j).toString())) {
                    like.remove(j);
                    likeSize = like.size();
                    j--;
                }
            }
        }
        return like;
    }

    private static void readArray(ArrayList list) {
        System.out.print(list.size()+" ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
