# BUBBLE SORT ALGORITHM
Simplest sort algorithm, it performs repeatedly swaps, comparing adjacent elements. 

# Complexity / Optimization:

**Best Case**: O(n)

**Worst Case**: O(n*n)

**OBS:** Although it has the best case better than selection sort, due the number of written done on your execution, bubble sort is lest performative than selection sort.

# How it works:
It compares the adjacent element, if in wrong position, those elements are swapped and then the comparison continues.


# Step by Step

1) List: `[6, 0, 3, 5]`;
2) Compare index 0 (6) > index 1 (0)
3) It's true, so swap positions
4) Result: `[0, 6, 3, 5]`;
5) Compare index 1 (6) > index 2 (3)
6) It's true, so swap positions 
7) Result: `[0, 3, 6, 5]`; 
8) Compare index 2 (6) > index 3 (5)
9) It's true, so swap positions
10) Result: `[0, 3, 5, 6]`; 
11) Restart again
12) Compare index 0 (0) > index 1 (3)
13) It's false, so: do nothing;
14) Compare index 1 (3) > index 2 (5);
15) It's false, so: do nothing;
16) As index 3 has the element that we had swapped in the first interaction, we can assume that this element is the highest of our list, so we don't need to validate it again;
17) Start again until finish all list.