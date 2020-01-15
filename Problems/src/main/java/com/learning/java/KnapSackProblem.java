package com.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class KnapSackProblem {

    private static  List<List<Integer>> weightCombinationList = new ArrayList();

    public static void combine(List<Integer> combination,List<Integer> weightsLeft){

        Iterator<Integer> leftWeightIterator = weightsLeft.iterator();

            while (leftWeightIterator.hasNext()){
                Integer weight = leftWeightIterator.next();
                combination.add(weight);
                leftWeightIterator.remove();
                weightCombinationList.add(combination);
                System.out.println("Combination :::: " + combination);
                combine(combination,weightsLeft);

            }
    }


    public static void main(String[] args) {
        // find all possible combination of weights

        List weights = new ArrayList();
        weights.add(10);
        weights.add(20);
        weights.add(30);
        combine(new ArrayList<Integer>(),weights);

    }

}
