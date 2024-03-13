
// Name : Chinmoy Das
// Date : 13/03/2024
// Problem : Find-the-pivot-integer
// Difficulty level : Easy
// Problem Link : https://leetcode.com/problems/find-the-pivot-integer/

class Solution {
    public int pivotInteger(int n) {
        int sum= n*(n+1)/2;
        double a= Math.sqrt(sum);

        if( a- Math.ceil(a)==0) return (int)a;
        else return -1;
    }
}

// Thankyou❤️‍🩹