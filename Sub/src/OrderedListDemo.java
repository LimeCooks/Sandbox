/*
Assignment 2
CSCI 2110
Due October 23rd 2019
Liam Cook, B00711028
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class OrderedListDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //Making the lists
        OrderedList<String> list1 = new OrderedList<String>();
        OrderedList<String> list2 = new OrderedList<String>();
        OrderedList<String> list3 = new OrderedList<String>();

        //creating the file and scanners
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first filename to read from: ");
        String one = kb.next();
        System.out.print("Enter the second filename to read from: ");
        String two = kb.next();
        File file1 = new File(one);
        File file2 = new File(two);
        //First File
        Scanner inputFile1 = new Scanner(file1);
        //Second File
        Scanner inputFile2 = new Scanner(file2);
        PrintStream fileOut = new PrintStream("merged.txt");
        System.setOut(fileOut);

        //While theres still data to be read
        while (inputFile1.hasNext()) {
            //buffer line
            String line = inputFile1.next();
            //insert to list
            list1.insert(line);
        }
        //Print list
        list1.enumerate();
        //Same as above but just list2
        while (inputFile2.hasNext()) {
            String line = inputFile2.next();
            list2.insert(line);
        }
        //Print list2
        list2.enumerate();

        //Merge the 2 lists to list3
        list3 = OrderedList.merge(list1,list2);
        //Print List 3
        list3.enumerate();
    }
}
