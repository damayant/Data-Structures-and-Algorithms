
INT_MAX = 4294967296
INT_MIN = -4294967296

class Node:
	def __init__(self,value):
		self.value = value
		self.left = None
		self.right = None


def isBST(node):
	return isBSTUtil(node,INT_MIN,INT_MAX)

def isBSTUtil(node,min,max):
	if node is None :
		return True
	if node.value < min or node.value > max :
		return False

	return (isBSTUtil(node.left,min,node.value-1)and isBSTUtil(node.right,node.value+1,max))




root = Node (30)
root.left = Node(90)
root.left.right = Node(25)
root.left.left = Node(10)
root.right = Node(50)
root.right.left = Node(40)
root.right.right = Node(60)
print(isBST(root))