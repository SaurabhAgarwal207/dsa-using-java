package com.saurabh.arrays;

public class RainWaterTrapped {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int ans= trapped(height);
        System.out.println(ans);
    }

    private static int trapped(int[] height) {
        //calculate left max boundary
        int n= height.length;
        int[] leftMax= new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max boundary
        int rightMax[]= new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //inside loop
        int trappedWater=0;
        for(int i=0;i<n;i++){
           // waterlevel = min(leftMAx,right max)
            int waterLevel= Math.min(leftMax[i],rightMax[i]);
            //water trapped = water level-height[i]
            trappedWater +=waterLevel-height[i];

        }
        return trappedWater;

    }
}
