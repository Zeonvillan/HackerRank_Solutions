**1D Array In C**

The question asks for the creation of a dynamic array in C and the calculation of the sum of its elements. It explains that an array is a container object that can hold a fixed number of values of a single type. In C, a static array can be created using the syntax "int arr[n]", where "arr" is the variable array that can hold up to "n" integers. However, the challenge requires the creation of a dynamic array, which can be achieved using the "malloc" function to allocate memory on the heap at runtime.

To create a dynamic array, the challenge suggests using the syntax "int *arr = (int*)malloc(n * sizeof(int))", where "arr" is a pointer that points to the base address of the dynamically allocated array. After reading the values from stdin and storing them in the array, the challenge instructs to iterate over the array to calculate the sum of all elements. Finally, the sum should be printed, and the memory allocated for the array should be freed using the "free(arr)" function.

The input format consists of two lines: the first line contains an integer "n" representing the size of the array, and the second line contains "n" space-separated integers representing the values to be stored in the array. There are no specific constraints mentioned.

The output format requires printing the sum of the integers in the array.

Two sample inputs and outputs are provided as examples to illustrate the expected behavior of the program.