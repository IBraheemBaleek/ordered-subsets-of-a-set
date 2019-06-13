The file main.java contains one recursive method that returns all ordered subsets of a given set,
all the characters in the given set must be unique.
The code is written in java 8.


Number of ordered subsets is:

![first equation](https://latex.codecogs.com/gif.latex?%5Cbinom%7Bn%7D%7Bn%7D%5Ccdot%20n%21%20&plus;%20%5Cbinom%7Bn%7D%7Bn-1%7D%5Ccdot%20%28n-1%29%21%20&plus;%20%5Cbinom%7Bn%7D%7Bn-2%7D%5Ccdot%20%28n-2%29%21%20&plus;%20...%20&plus;%20%5Cbinom%7Bn%7D%7B1%7D%5Ccdot%201%21)

Example: 
if we call the function with input string "ABC", the output will be:

Number Of Subsets: 
15 
Subsets: 
A,B,C 
A,B 
A,C,B 
A,C 
A 
B,A,C 
B,A 
B,C,A 
B,C 
B 
C,A,B 
C,A 
C,B,A 
C,B 
C 
