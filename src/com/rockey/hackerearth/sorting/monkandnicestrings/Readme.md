Monk and Nice Strings
Monk's best friend Micro's birthday is coming up. Micro likes Nice Strings very much, so Monk decided to gift him one. Monk is having N nice strings, so he'll choose one from those. But before he selects one, he need to know the Niceness value of all of those. Strings are arranged in an array A, and the Niceness value of string at position i is defined as the number of strings having position less than i which are lexicographicaly smaller than . Since nowadays, Monk is very busy with the Code Monk Series, he asked for your help.
Note: Array's index starts from 1.

Input:
First line consists of a single integer denoting N.
N lines follow each containing a string made of lower case English alphabets.

Output:
Print N lines, each containing an integer, where the integer in  line denotes Niceness value of string .

Constraints:

, where  denotes the length of  string.

Sample Input
4
a
c
d
b
Sample Output
0
1
2
1
Explanation
Number of strings having index less than 1 which are less than "a" = 0
Number of strings having index less than 2 which are less than "c": ("a") = 1
Number of strings having index less than 3 which are less than "d": ("a", "c") = 2
Number of strings having index less than 4 which are less than "b": ("a") = 1

Time Limit: 1.0 sec(s) for each input file
Memory Limit: 256 MB
Source Limit: 1024 KB