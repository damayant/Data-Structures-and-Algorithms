#To heapify a subtree rooted at index i
#n is size of heap
def heapify(arr,n,i):
	largest = i #initialise the largest as root
	l = 2*i + 1 #left = 2*i + 1
	r = 2*i + 2 #right = 2*i + 2

	#check if left child of root exists
	#if exists then if greater than root
	if l<n and arr[i]<arr[r] < arr[l] :
		largest = l

	#check if the right child exists
	#if exists then if greater than root
	if r<n and arr[largest]<arr[r]:
		largest = r

	#change the root, if needed
	if largest !=i :
		arr[i] , arr[largest] = arr[largest] , arr[i]

		#heapify the root
		heapify(arr,n.largest)

#main function to sort an array of given size
def heapSort(arr):
	n = len(arr)

	#build maxheap
	for i in range(n,-1,-1): #going through the list in th reverse manner
		heapify(arr,n,i)

	#one by one extract elements
	for i in range(n-1,0,-1):
		arr[i], arr[0] = arr[0], arr[i]
		heapify(arr,i,0)

# Driver code to test above
arr = [ 12, 11, 13, 5, 6, 7]
heapSort(arr)
n = len(arr)
print ("Sorted array is")
for i in range(n):
    print ("%d" %arr[i])