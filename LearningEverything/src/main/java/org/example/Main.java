package org.example;

import BinaryTree.BinaryTree;
import algorithms.*;
import leetcodeEasy.*;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        /*// Sorted array is required
        BinarySearch bs = new BinarySearch();
        int array[] = new int[]{1, 2, 5, 13, 14, 16, 125, 953, 999};
        int valueToFind = 125;
        int answer = bs.find(array, valueToFind);
        if(answer == -1) System.out.println("Value " + valueToFind + " does not exist in the array");
            else System.out.println("Value " + valueToFind + " is at position " + answer);
         */


        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        System.out.println("Depth-First Search");
        bt.traverseInOrder(bt.root);

    }
}
