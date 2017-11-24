/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


Example 1:
Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps


Example 2:
Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/ 

public class Stairs {

	/*	
		let opt denote the optimal solution, as well as the name of our memoization table
		I. subproblem. opt(i) = "the number of ways to climb i stairs given you can climb 1 or 2 steps at a time"
		II. recurrence. opt(i) = opt(i - 1) + opt(i - 2)

			Justification: given that you can climb stairs one or two steps at a time, there are only two ways to 
			climb  to step i, you'll have to first climb to step i - 1 and take one step or i -2 and take two steps.
			 These are the two ways to get to step i, therefore all the ways to climb to step i are covered in
			 opt(i - 2) + opt(i - 2)
		III. answer to original question: opt(n); 
		IV. Base cases: opt(0) = 1. 
						for all i < 0, opt(i) = 0, it's impossible to climb to a negative step. 
		V. implementation: in our implementation, we initialized opt(0) and opt(1) in order to avoid dealing with 
			negative array indexing 
	*/ 
	public static int solveStairs(int n) {
		int[] opt = new int[n + 1]; 
        opt[0] = 1; 
        opt[1] = 1; 
        for (int i = 2; i <= n; i++) {
            opt[i] = opt[i - 1] + opt[i - 2]; 
        }
        return opt[n]; 
	}

	// various tests 
	public static void main(String[] args) {
		
	}
}