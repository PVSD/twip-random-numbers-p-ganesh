package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        int count = 0;
        int rand;
        int y;
        int counter = 0;
        int runTime = 1000000;
        int totalCount = 0;

        while (counter != runTime) {
            int check [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                    21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
                    41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
                    61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,
                    81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};

            while (x != 100) {
                rand = (int) (Math.random() * 100 + 1);
                count++;
                y = rand - 1;

                if (rand == check[y]) {
                    x++;
                    check[y] = 0;
                }

            }
            totalCount += count;
            counter ++;
        }
        int average = totalCount/runTime;
        System.out.println("i set my method to run " + runTime + " times and its average was " + average +
                " times to hit all numbers.");
    }
}

/*Basically the while loop is what runs the method to check for all of the numbers from 1 to 100. The two lines of
code after the second while loop increment the total count and calculate the average. The int at the top named runTime
is what dictates how many times the method has to run before it is allowed to stop.

Like any experiment, the results and assumptions have a greater statistical significance if ther eare multiple trials
done. The more trials, the lower standard deviation, and the higher statistical significance.
 */