#Write a function to print spiral order traversal of a tree. 
#Amazon,Adobe,Microsoft

class Node :
	def __init__(self,val):
		self.right = None
		self.left = None
		self.data = val

def printSpiralLevelOrder(root):
	s1 = []
	s2 = []
	s1.append(root)
	while(len(s1)>0 or len(s2)>0):
		while(len(s1)>0):
			node = s1.pop()
			print(node.data,end = " ")
			if(node.right):
				s2.append(node.right)
			if(node.left):
				s2.append(node.left)
		while(len(s2)>0):
			node = s2.pop()
			node.s2.pop()
			print(node.data,end = " ")
			if (node.left):
				s1.append(node.left)
			if(node.right):
				s1.append(node.right)

