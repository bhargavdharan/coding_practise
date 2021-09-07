# Dimensions in Arrays
import numpy as np
# 0-D Arrays
arr = np.array(42)
print("O-D Array ===> ",arr)
print("Total Dimensions in Array ==> ",arr.ndim)
print("==========================================================")
print("==========================================================")

#1-D Arrays
arr = np.array([1,2,3,4,5,6])
print("1-D Array ===>",arr)
print("Total Dimensions in Array ==> ",arr.ndim)
print()
print("<---Accessing elements in 1-D Array--->")
print("Element at first index ==> ",arr[0])
print("Element at second index ==> ",arr[1])
print("Element at third index ==> ",arr[2])
print()
print("<---Adding Array Elements--->")
print("Adding first element and second element in array ==>",arr[0] + arr[1])
print()
print("<---slicing elements in 1-D Array--->")
print("slicing elements from index 1 to index 5 ===> ",arr[1:5])
print("slicing elements from index 4 to last index ===> ",arr[4:])
print("slicing elements from beginning index to last index ===> ",arr[:6])


print("==========================================================")

#2-D Arrays
arr = np.array([[1,2,3,4,5,6],[7,8,9,10,11,12]])
print("2-D Array ===> ",arr)
print("Total Dimensions in Array ==> ",arr.ndim)
print()
print("<---Accessing Elements in 2-D Array--->")
print("Accessing 1st element on 1st dim: arr[0,0] ==> ",arr[0,0])
print("Accessing 2nd element on 1st dim: arr[0,1] ==> ",arr[0,1])
print("Accessing 1st element on 2nd dim: arr[1,0] ==> ",arr[1,0])
print("Accessing 2nd element on 2nd dim: arr[1,1] ==> ",arr[1,1])
print()
print("<---Slicing elements in 2-D Array--->")
print("from first element , slice elements from index 1 to index 4",arr[0,1:4])
print("from second element , slice elements from index 1 to index 4",arr[1,1:4])
print("==========================================================")
#3-D Arrays
arr = np.array([ [[1,2,3],[4,5,6]] , [[8,9,10],[11,12,13]] ])
print("3-D Array ===> ",arr)
print("Total Dimensions in Array ==> ",arr.ndim)
print("<---Accessing Elements in 3-D Array--->")
print("Accessing 1st element on 1st array in 1st Array ===> ",arr[0,0,0])
print("Accessing 2nd element on 1st array in 1st Array ===> ",arr[0,0,1])
print("Accessing 3rd element on 1st array in 1st Array ===> ",arr[0,0,2])
print()
print("Accessing 1st element on 2nd array in 1st Array ===> ",arr[0,1,0])
print("Accessing 2nd element on 2nd array in 1st Array ===> ",arr[0,1,1])
print("Accessing 3rd element of 2nd array in 1st Array ===> ", arr[0,1,2])
print()
print("Accessing 1st element on 1st Array in 2nd Array ===>",arr[1,0,0])
print("Accessing 2nd element on 1st Array in 2nd Array ===>",arr[1,0,1])
print("Accessing 3rd element on 1st Array in 2nd Array ===>",arr[1,0,2])
print("==========================================================")


