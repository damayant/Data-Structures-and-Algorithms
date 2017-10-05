#Check if a binary tree is balanced or not
class Node:
	def __init__(self,value):
		self.value = value
		self.right = None
		self.left = None

def leftHeight(node):
	if node is None :
		return 0
	if node:
		l = leftHeight(node.left)
	return l+1

def rightHeight(node):
	if node is None :
		return 0
	if node:
		r = rightHeight(node.right)
	return r+1

def isBSTUtil(lh,rh):
	diff = lh-rh
	if (diff<=1):
		return True
	return False



root = Node(30)
root.left = Node(20)
root.right = Node(50)
root.left.left = Node(10)
#root.left.left.left = Node(5)
print(leftHeight(root))
print(rightHeight(root))
print(isBSTUtil(leftHeight(root),rightHeight(root)))

