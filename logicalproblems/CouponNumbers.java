package com.bridgelabz.logicalproblems;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	
	public static int generateCoupon(int n) {
        Random random = new Random();
        HashSet<Integer> coupons = new HashSet<>();

        int totalRandomNumbers = 0;

        while (coupons.size() < n) {
            int coupon = random.nextInt(n * 10);
            totalRandomNumbers++;
            coupons.add(coupon);
        }

        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        int count = generateCoupon(n);

        System.out.println("Total random numbers needed: " + count);

        sc.close();
    }

}
