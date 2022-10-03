## Assignment for my Data Structures and Algorithm class

-   You can use this for your projects and what not although, most of the algorithms in this repo can simply be imported as a library (which is more convenient)

sorry for the spaghetti code, I had less than an hour to submit this and I probably won't clean the code as I will be busy with other projects or lazy enough to not care about this repo but If you want to clean the code or perhaps make it better you are welcome to do so.

`spaghetti code or not the logic for most of the important sorting algorithms will be here, linear and binary search are pretty basic but the logic for them will also be here`

## Question

-   (I've used merge sort and binary search for testing in the main class)
-   `I'll update the question after documenting`

## Score

`I'll update when I get graded`

---

## How I have tested the code

`Succeeded code = 100%`

`failed code = 0%`

-   I created bunch of data to push into the array, in the data it included
    -   Integers
    -   Duplicates
    -   Non Integers (Floats, Strings)
-   of course anything other than Integers should not be accepted as a data type in the array thats being used for sorting and searching so, Ive' used int return methods which forces you to use int values
-   the sort algorithm speeds were recorded and commented next to the object class

---

# Report

> I've used different java class files instead of pushing all into one file making it more difficult to read than it already is to read java code

## Search algorithms

### Linear search

-   It wasn't fast when compared with binary search but as the hardware nowadays are very reliable it was fast in the comprehensive of the human brain
-   although it was a solid avg 500 milisecond slower in 10 different searches than Binary search

### Binary search

-   The fastest out of the two searching algorithms I was asked to implement in this assignment
-   avg of 500 milisecond faster in 10 searches

## Sort algorithms

`speed are documented on the code as comments, following list are order from the least convenient to the best`

### Linear Sort

-   Extremely slow just as the theory suggests O(n) speed as best

### Bubble Sort

-   Not that fast but it is acceptable, with the average speed of O(n) although in some cases it showed O(n^2)

### Selection Sort

-   speed of O(n^2) will not use for sorting data

### Insertion Sort

-   Equally as fast as the bubble sort, in average it shows O(n), at worst it gave O(n^2)

### Quick Sort

-   One of the fastest with the speed of O(n log n) worst hitting O(n^2)

### Merge Sort

-   Fasted out of the given sorting algorithms, giving O(n log n) in both average and worst, 100% will recommend to use this algorithm for sorting
