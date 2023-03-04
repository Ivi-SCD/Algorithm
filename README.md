# Sorting Algorithms :spades:


In this repository I will declare some summaries and explanations about sorting algorithms and others. So, let's start...

### List of topics:
 * [What is an sorting algorithm?](#esortal)
 * [Selection Sort?](#selsort)
##
## <a name = "esortal"> What is an sorting algorithm? </a>

Sorting algorithms are methods that **rearrange a set of elements in a certain order.** These elements can be numbers, letters, objects or anything else that can be compared and sorted.

Sorting is a common operation in many areas of computer science, including databases, file management systems, search systems, data analysis, computer graphics, among others. There are several different sorting algorithms, each with their own strengths and weaknesses.

Sorting algorithms can be classified into two main categories: internal and external sorting algorithms. Internal sorting algorithms are used when all the data that needs to be sorted can be kept in main memory (RAM). External sorting algorithms are used when data does not fit in main memory and needs to be stored on disk or other external storage devices.

Some examples of internal sorting algorithms include **Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort, and Heap Sort**. External sorting algorithms include external **Merge Sort and Polyphase Sort**.

Each sorting algorithm has its own time and space complexity, which means that some algorithms may be more efficient than others in certain situations. Therefore, it is important to choose the right sorting algorithm for each specific problem, taking into account the characteristics of the data to be sorted and the memory and time constraints.
##
### <a name="selsort"> Selection Sort :spades: </a>

The Selection Sort is a simple sorting algorithm that traverses a list of elements, finds the smallest remaining element, and puts it in its correct position in the list. This process is repeated until the list is completely sorted.

The algorithm works as follows:

- Traverse the list to be sorted from beginning to end.
- Find the smallest remaining element in the list.
- Swap the smallest element with the first remaining element.
- Continue traversing the list, but now from the second element onwards.
- Find the smallest remaining element in the list starting from the second element.
- Swap the smallest element with the second remaining element.
- Repeat steps 4 to 6 until the list is completely sorted.

The algorithm has a *time complexity of O(n^2), where n is the number of elements in the list.* This is because the algorithm needs to traverse the list several times to find the smallest remaining element. Therefore, it is less efficient than algorithms like Merge Sort and Quick Sort, which have a better time complexity.

However, Selection Sort can be useful in some situations, such as when the list is very small or when the list is almost sorted. Additionally, Selection Sort is an in-place algorithm, meaning it does not require additional memory to sort the list. This makes it useful in situations where memory space is limited.

Here are the implementation in [Java](https://github.com/Ivi-SCD/Algorithm/blob/main/SelectionSort/src/br/com/ip/sort/SelectionSort.java), [Python](https://github.com/Ivi-SCD/Algorithm/blob/main/SelectionSort/src/br/com/ip/sort/SelectionSort.py), [C](https://github.com/Ivi-SCD/Algorithm/blob/main/SelectionSort/src/br/com/ip/sort/SelectionSort.c)
