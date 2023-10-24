**BitWise Operator**

The challenge requires you to use logical bitwise operators in C language. You will be given two integers, n and k. You need to find the maximum values of the bitwise AND, OR, and XOR operations on all possible pairs of integers from 1 to n, such that the result of each operation is less than k. The bitwise AND operation returns 1 if the corresponding bits of two operands are 1. The bitwise OR operation returns 1 if at least one corresponding bit of two operands is 1. The bitwise XOR operation returns 1 if the corresponding bits of two operands are opposite. All data is stored in its binary representation. The logical operators, and C language, use 0 to represent false and 1 to represent true. 

You need to implement a function called `calculate_the_maximum` that takes two integers, n and k, as input parameters. The function should print the maximum values of the bitwise AND, OR, and XOR operations on all possible pairs of integers from 1 to n, such that the result of each operation is less than k. The function should print the maximum values for the AND, OR, and XOR comparisons, each on a separate line. 

The input is provided in a single line, containing two space-separated integers, n and k. The output should be printed to the console. 

Example:

Input:
5 4

Output:
2
3
3

Explanation: 

All possible values of AND, OR, and XOR are calculated below:

a b   and or xor
1 2   0   3  3
1 3   1   3  2
2 3   2   3  1

For the AND comparison, the maximum possible value of a AND b that is also less than k=4 is 2, so we print 2 on the first line. For the OR comparison, none of the values is less than k=4, so the maximum is 3. For the XOR comparison, the maximum possible value of a XOR b that is also less than k=4 is 2, so we print 2 on the third line.