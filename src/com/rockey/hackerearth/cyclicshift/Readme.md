Cyclic shift
A large binary number is represented by a string  of size  and comprises of  and . You must perform a cyclic shift on this string. The cyclic shift operation is defined as follows:

If the string  is , then after performing one cyclic shift, the string becomes .
You performed the shift infinite number of times and each time you recorded the value of the binary number represented by the string. The maximum binary number formed after performing (possibly ) the operation is . Your task is to determine the number of cyclic shifts that can be performed such that the value represented by the string  will be equal to  for the  time.

Input format

First line: A single integer  denoting the number of test cases
For each test case:
First line: Two space-separated integers  and 
Second line:  denoting the string
Output format

For each test case, print a single line containing one integer that represents the number of cyclic shift operations performed such that the value represented by string  is equal to  for the  time.

Constraints


, for each 

Note: Sum of  overall test cases does not exceed 

Sample Input
2
5 2
10101
6 2
010101
Sample Output
9
3
Explanation
For the 1st test case, the value of  is . After performing  cyclic shifts the value represented by array  becomes equal to  for the first time. After performing additional  cyclic shifts the value represented by array  becomes   for the second time. Hence, the answer is 

For the 2nd test case, the value of  is . After performing  cyclic shifts the value represented by array  becomes equal to  for the first time. After performing additional  cyclic shifts the value represented by array  becomes  for the second time. Hence, the answer is 

Time Limit: 1.0 sec(s) for each input file
Memory Limit: 256 MB
Source Limit: 1024 KB