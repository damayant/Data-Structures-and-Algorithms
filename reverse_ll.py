class Node :
	def __init__(self,data):
		self.data = data
		self.next = None

def reverseLL(self):
	if self.head is None:
		return None
	previous = None
	current = self.head
	while(current is not None):
		next = current.next
		current.next = previous
		previous = current
		current = next
	self.head = previous
