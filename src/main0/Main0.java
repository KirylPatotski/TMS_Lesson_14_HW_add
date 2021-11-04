package main0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class creates an array list which consist of random integers. Then it does tasks.
 */
    public class Main0 {

        public static void main(String[] args) {
            doTasks();
        }

        private static void doTasks(){
            ArrayList<Integer> ints = defineArray(1000,0,100000);
            removeDuplicates(ints);
            showOnlyNumberSeven(ints);
            multiplyByTwo(ints);
            sortAndFindFirst(ints);
            findAverage(ints);
            findNumberOfElements(ints);
        }

        private static ArrayList<Integer> defineArray(int Elements, int min, int max){
            ArrayList<Integer> ints = new ArrayList<>();
            for (int i = 0; i < Elements; i++) {
                int randomNum = ThreadLocalRandom.current().nextInt(min,max);
                ints.add(randomNum);
            }
            System.out.println(ints);
            return ints;
        }

        private static void removeDuplicates(ArrayList<Integer> ints) {
            System.out.println("Old length: " + ints.size());
            Stream<ArrayList<Integer>> streamFromValues = Stream.of(ints);
            List<Integer> listWithoutDuplicates = ints.stream().distinct().collect(Collectors.toList());
            System.out.println(listWithoutDuplicates);
            System.out.println("New length: " + listWithoutDuplicates.size());

        }

        private static void showOnlyNumberSeven(ArrayList<Integer> ints){

            Stream<ArrayList<Integer>> streamFromArrays = Stream.of(ints);
            for (int i = 0; i < ints.size(); i++) {
                int temporary = ints.get(i);
                if (temporary % 2 == 0 && temporary >= 7 && temporary <= 17) {
                    System.out.print(temporary + " ");

                }
            }
        }

        private static void multiplyByTwo(ArrayList<Integer> ints) {
            Stream<ArrayList<Integer>> streamFromArrays = Stream.of(ints);
            System.out.println();
            System.out.println("Everything doubled:");
            for (int i = 0; i < ints.size(); i++) {
                int temporary = ints.get(i);
                System.out.print(temporary*2+ " ");
            }
        }

        private static void sortAndFindFirst(ArrayList<Integer> ints) {
            Stream<ArrayList<Integer>> streamFromArrays = Stream.of(ints);
            System.out.println();
            System.out.println("Everything sorted:");
            ArrayList<Integer> arrayList = new ArrayList<>();
            Collections.sort(ints);
            for (int i = 0; i < 4; i++) {
                System.out.print(ints.get(i)+ " ");
            }

        }

        private static void findAverage(ArrayList<Integer> ints) {
            Stream<ArrayList<Integer>> streamFromArrays = Stream.of(ints);
            System.out.println();
            int sum = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < ints.size(); i++) {
                sum+=ints.get(i);
            }
            sum/= ints.size();
            System.out.println("On average: " + sum);

        }

        private static void findNumberOfElements(ArrayList<Integer> ints) {
             Stream<ArrayList<Integer>> streamFromArrays = Stream.of(ints);
            System.out.println();
            System.out.println(streamFromArrays.count()+ " is there in the Stream");
        }

    }




