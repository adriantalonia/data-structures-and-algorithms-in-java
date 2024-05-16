# Array

**Array** is a linear data structure that stores a collection of elements of the same data type. Elements are allocated contiguous memory, allowing for constant-time access. Each element has a unique index number.

> An array is a collection of items of same data type stored at contiguous memory locations.

## Basic terminologies of Array:
- **Array Index**: In an array, elements are identified by their indexes. Array index starts from 0.
- **Array element**: Elements are items stored in an array and can be accessed by their index.
- **Array Length**: The length of an array is determined by the number of elements it can contain.

![img](/src/resources/img/array_img.png)

### Characteristics of Array Data Structure:
- **Homogeneous Elements:** All elements within an array must be of the same data type.
- **Contiguous Memory Allocation:** In most programming languages, elements in an array are stored in contiguous (adjacent) memory locations.
- **Zero-Based Indexing:** In many programming languages, arrays use zero-based indexing, which means that the first element is accessed with an index of 0, the second with an index of 1, and so on.
- **Random Access:** Arrays provide **constant-time (O(1))** access to elements. This means that regardless of the size of the array, it takes the same amount of time to access any element based on its index.

### Types of arrays:

1) **One-Dimensional Array**: This is the simplest form of an array, which consists of a single row of elements, all of the same data type. Elements in a 1D array are accessed using a single index.

![img](/src/resources/img/1Darray.png)

2) **Two-Dimensional Array**: A two-dimensional array, often referred to as a matrix or 2D array, is an array of arrays. It consists of rows and columns, forming a grid-like structure. Elements in a 2D array are accessed using two indices, one for the row and one for the column.

![img](/src/resources/img/2Darray.png)

3) **Multi-Dimensional Array**: Arrays can have more than two dimensions, leading to multi-dimensional arrays. These are used when data needs to be organized in a multi-dimensional grid.

![img](/src/resources/img/3D-array.jpg)

### Types of Array operations:
- **Accessing Elements**: Accessing a specific element in an array by its index is a constant-time operation. It has a time complexity of **O(1)**.
- **Insertion**: Appending an element to the end of an array is usually a constant-time operation, **O(1)** but insertion at the beginning or any specific index takes **O(n)** time because it requires shifting all of the elements.
- **Deletion**: Same as insertion, deleting the last element is a constant-time operation, **O(1)** but deletion of element at the beginning or any specific index takes **O(n)** time because it requires shifting all of the elements.
- **Searching**: Linear Search takes **O(n)** time which is useful for unsorted data and Binary Search takes **O(logn)** time which is useful for sorted data.

### Declaration of Array:

```java
// Syntax to Declare an Array in Java
dataType[] arr; (or)  
dataType []arr; (or)  
dataType arr[];  
```

```java
// Instantiation of an Array in Java
arrayRefVar = new datatype[size];

int a[] = new int[5];//declaration and instantiation  
a[0] = 10;//initialization  
a[1] = 20;
a[2] = 70;
a[3] = 40;
a[4] = 50;  
```

```java
int[] arrInt = { 1, 2, 3, 4, 5 }; //declaration, instantiation and initialization  
char[] arrChar = { 'a', 'b', 'c', 'd', 'e' };
float[] arrFloat = { 1.4f, 2.0f, 24f, 5.0f, 0.0f };
```
### Types of Arrays:
Arrays can be classified in two ways:

1) On the basis of Memory Allocation
   - **Static Arrays**: In this type of array, memory is allocated at compile time having a fixed size of it. We cannot alter or update the size of this array. This type of memory allocation is also known as static or compile-time memory allocation. Here only a fixed size (i,e. the size that is mentioned in square brackets []) of memory will be allocated for storage. In case, we don’t know the size of the array then if we declare a larger size and store a lesser number of elements will result in a wastage of memory or or we declare a lesser size than the number of elements then we won’t get enough memory to store all the elements. In such cases, static memory allocation is not preferred.
   ```java
   // Static Array
    int[] arr = { 1, 2, 3, 4, 5 };
   ```
   - **Dynamic Arrays**: In this type of array, memory is allocated at run time but not having a fixed size. Suppose, a user wants to declare any random size of an array, then we will not use a static array, instead of that a dynamic array is used. This type of memory allocation is also known as dynamic or run-time memory allocation. It is used to specify the size of it during the run time of any program.
   ```java
   // Dynamic Integer Array
    ArrayList<Integer> arr = new ArrayList<>();
   ```

2) On the basis of Dimensions
    - **One-dimensional Array(1-D Array)**: You can imagine a 1d array as a row, where elements are stored one after another.
    - **Multi-dimensional Array**: A multi-dimensional array is an array with more than one dimension. We can use multidimensional array to store complex data in the form of tables, etc. We can have 2-D arrays, 3-D arrays, 4-D arrays and so on.
        - **Two-Dimensional Array(2-D Array or Matrix)**: 2-D Multidimensional arrays can be considered as an array of arrays or as a matrix consisting of rows and columns.
        - **Three-Dimensional Array(3-D Array)**: A 3-D Multidimensional array contains three dimensions, so it can be considered an array of two-dimensional arrays.

## Operations on Arrays

1. **Array Traversal**: Array traversal involves visiting all the elements of the array once. Below is the implementation of Array traversal in different Languages:
```java
int[] arrInt = { 1, 2, 3, 4, 5 };
// Traversing over arr[]
for (int number : arrInt) {
    System.out.print(number + " ");
}
```

2. **Insertion in Array**: We can insert one or multiple elements at any position in the array. Below is the implementation of Insertion in Array in different languages:
```java
public static void insertElement(int[] arr, int n, int x, int pos) {
        // shift elements to the right
        // which are on the right side of pos
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }
```

3. **Deletion in Array**: We can delete an element at any index in an array. Below is the implementation of Deletion of element in an array:
```java
    // function to search a key to
    // be deleted
    public static int findElement(int arr[], int n, int key) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        // Return -1 if key is not found
        return -1;
    }

    // Function to delete an element
    public static int deleteElement(int arr[], int n, int key) {
        // Find position of element to be
        // deleted
        int pos = findElement(arr, n, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }

        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];

        return n - 1;
    }
```

4. **Searching in Array**: We can traverse over an array and search for an element. Below is the implementation of Deletion of element in an array:
```java
// Function to implement search operation
int findElement(int arr[], int n, int key)
{
    for (int i = 0; i < n; i++)
        if (arr[i] == key)
            return i;

    // If the key is not found
    return -1;
}
```

## Complexity Analysis of Operations on Array:

**Time Complexity:**

| Operation | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| Traversal | Ω(N)      | θ(N)         | O(N)       |
| Insertion | Ω(1)      | θ(N)         | O(N)       |
| Deletion  | Ω(1)      | θ(N)         | O(N)       |
| Searching | Ω(1)      | θ(N)         | O(N)       |

**Space Complexity:**

| Operation | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| Traversal | Ω(N)      | θ(N)         | O(N)       |
| Insertion | Ω(1)      | θ(N)         | O(N)       |
| Deletion  | Ω(1)      | θ(N)         | O(N)       |
| Searching | Ω(1)      | θ(N)         | O(N)       |

## Advantages of Array:
* **Efficient access to elements**: Arrays provide direct and efficient access to any element in the collection. Accessing an element in an array is an O(1) operation, meaning that the time required to access an element is constant and does not depend on the size of the array.
* **Fast data retrieval**: Arrays allow for fast data retrieval because the data is stored in contiguous memory locations. This means that the data can be accessed quickly and efficiently without the need for complex data structures or algorithms.
* **Memory efficiency**: Arrays are a memory-efficient way of storing data. Because the elements of an array are stored in contiguous memory locations, the size of the array is known at compile time. This means that memory can be allocated for the entire array in one block, reducing memory fragmentation.
* **Versatility**: Arrays can be used to store a wide range of data types, including integers, floating-point numbers, characters, and even complex data structures such as objects and pointers.
* **Easy to implement**: Arrays are easy to implement and understand, making them an ideal choice for beginners learning computer programming.
* **Compatibility with hardware**: The array data structure is compatible with most hardware architectures, making it a versatile tool for programming in a wide range of environments.

## Disadvantages of Array:
* **Fixed size**: Arrays have a fixed size that is determined at the time of creation. This means that if the size of the array needs to be increased, a new array must be created and the data must be copied from the old array to the new array, which can be time-consuming and memory-intensive.
* **Memory allocation issues**: Allocating a large array can be problematic, particularly in systems with limited memory. If the size of the array is too large, the system may run out of memory, which can cause the program to crash.
* **Insertion and deletion issues**: Inserting or deleting an element from an array can be inefficient and time-consuming because all the elements after the insertion or deletion point must be shifted to accommodate the change.
* **Wasted space**: If an array is not fully populated, there can be wasted space in the memory allocated for the array. This can be a concern if memory is limited.
* **Limited data type support**: Arrays have limited support for complex data types such as objects and structures, as the elements of an array must all be of the same data type.
* **Lack of flexibility**: The fixed size and limited support for complex data types can make arrays inflexible compared to other data structures such as linked lists and trees.

## Applications of Array:
* **Storing and accessing data**: Arrays are used to store and retrieve data in a specific order. For example, an array can be used to store the scores of a group of students, or the temperatures recorded by a weather station.
* **Sorting**: Arrays can be used to sort data in ascending or descending order. Sorting algorithms such as bubble sort, merge sort, and quicksort rely heavily on arrays.
* **Searching**: Arrays can be searched for specific elements using algorithms such as linear search and binary search.
* **Matrices**: Arrays are used to represent matrices in mathematical computations such as matrix multiplication, linear algebra, and image processing.
* **Stacks and queues**: Arrays are used as the underlying data structure for implementing stacks and queues, which are commonly used in algorithms and data structures.
* **Graphs**: Arrays can be used to represent graphs in computer science. Each element in the array represents a node in the graph, and the relationships between the nodes are represented by the values stored in the array.
* **Dynamic programming**: Dynamic programming algorithms often use arrays to store intermediate results of subproblems in order to solve a larger problem.

## Frequently Asked Questions (FAQs) on Arrays:
1. **What is an array in data structure with example?**

   An array is a collection of items of the same data type stored at contiguous memory locations. Ex. int arr[5] = {1,2,3,4,5};

2. **Why array is a data structure?**

   Arrays store elements of the same type, they are classified as homogeneous data structures. They can store numbers, strings, characters, boolean values (true and false), objects, and so on.

3. **What data structure is an array?**

   An array is a linear data structure that stores similar elements in contiguous memory locations.

4. **What are the types of arrays?**

   There are majorly two types of arrays:
   - One dimensional array
   - Multidimensional array
   
5. **How is data stored in an array?**

   An array is a collection of items of the same data type stored at contiguous memory locations or says the elements are stored one after another in memory. An array uses an index system starting at 0 and going to (n-1), where n is its size.

6. **Difference between array and structure?**

   The structure can contain variables of different types but an array only contains variables of the same type.

7. **What are the limitations of an array?**

   An array is a collection of items of the same data type. That means, in an integer array only integer values can be stored, while in a float array only floating values and character array can have only characters. Thus, no array can have values of two data types.

8. **What are the advantages of an array?**

   There are multiple advantages of array data structure and some of them are:
   - Arrays allow random access to elements. This makes accessing elements by position faster.
   - Arrays store multiple data of similar types with the same name.
   - Array data structures are used to implement the other data structures like linked lists, stacks, queues, trees, graphs, etc.
   
9. **What is the purpose of using arrays?**

   An array is used when several variables of the same type need to be used, and it can be defined as a sequence of objects of the same type.

10. What is a multidimensional array?

    A multi-dimensional array can be termed as an array of arrays that stores homogeneous data in tabular form. Data in Multidimensional Arrays are stored in row-major order.

### Conclusion

After the discussion, we concluded that arrays are a simple method of accessing elements of the same type by grouping them and we can find the elements efficiently by their indexes and can perform different operations using them. Thus, they are more efficient when it comes to memory allocation and should be used in all modern programming languages. So, this becomes a favorite topic for the perspective of the interview and most of the companies generally asked about the problems on the array. For all these reasons, we must have a good knowledge of it.