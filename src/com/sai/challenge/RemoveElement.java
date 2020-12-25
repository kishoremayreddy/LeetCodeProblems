package com.sai.challenge;

public class RemoveElement {

    public static void main(String[] args) {
        removeElement(new int[]{1, 2, 2, 3, 4}, 2);
    }

    public static int removeElement(int[] nums, int val) {
      int i=0;
      for(int j=0;j< nums.length;j++){
          if(nums[j]!=val){
              nums[i]=nums[j];
              i++;
          }
      }
        return i;
    }
}