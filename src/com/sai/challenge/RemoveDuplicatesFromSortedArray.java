package com.sai.challenge;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static int  removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println(i+1);
        return i+1;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,2,2,3,4,5});

    }
}
