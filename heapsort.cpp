//C++ program for implemntation of Heap Sort
#include<iostream>
using namespace std;

//to heapify a subtree rooted with node i which
//is an index in arr[]. n is size of heap

void heapify(int arr[],int n,int i)
{
	int largest = i ; //initialise largest as root
	int l = 2*i + 1 ; // left = 2*i + 1
	int r = 2*i + 2 ; // right = 2*i + 2

	//if left child is larger than root
	if(l<n && arr[l]>arr[largest])
		largest = l ;
	//if the right child is larger than largest so far
	if(r<n && arr[r]>arr[largest])
		largest = r ;
	//if largest is not root
	if(largest!=i)
	{
		swap(arr[i],arr[largest]);
		//recursively heapify the affected sub-tree
		heapify(arr,n,largest);
	}
}

//main function to do heap Sort
void heapSort(int arr[],int n)
{
	//build heap, rearrange array
	for(int i=n/2-1;i>=0;i--)
		heapify(arr,n,i);
	//one by one extract elements from top
	for(int i = n-1;i>=0;i--)
	{
		//move current root to end
		swap(arr[0],arr[i]);
		//call max-heapify on the reduced heap
		heapify(arr,i,0);
	}
}

//utility function to print array of size n
int main()
{
	int arr[] = {12,11,13,5,6,7};
	int n = sizeof(arr)/sizeof(arr[0]);

	heapSort(arr,n);

	cout<<"Sorted Array is \n" ;
	for(int i=0;i<6;i++)
		cout << arr[i] << "\n";
}