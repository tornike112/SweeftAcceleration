//This is a data structure where elements can be of any type [T] and are stored in a
// mutableMapOf<T, Node<T>>().
class MyDataStructure<T> {
    // Inner Node class to represent elements in the data structure
    private inner class Node<T>(val value: T, var previous: Node<T>? = null, var next: Node<T>? = null)
    private val map = mutableMapOf<T, Node<T>>()
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    fun add(value: T) {
        val newNode = Node(value)
        map[value] = newNode
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            newNode.previous = tail
            tail = newNode
        }
    }
    fun getAllItems(): List<T> {
        val items = mutableListOf<T>()
        var current = head
        while (current != null) {
            items.add(current.value)
            current = current.next
        }
        return items
    }
    fun remove(value: T) {
        val node = map[value] ?: return
        map.remove(value)
        if (node == head) {
            head = node.next
        }
        if (node == tail) {
            tail = node.previous
        }
        node.previous?.next = node.next
        node.next?.previous = node.previous
    }

    fun contains(value: T): Boolean {
        return map.containsKey(value)
    }
}
fun main(){
    val myDataStructure=MyDataStructure<String>()
    myDataStructure.add("banana")
    myDataStructure.add("apple")
    myDataStructure.add("peach")
    myDataStructure.add("peach")
    println(myDataStructure.getAllItems())
    myDataStructure.remove("peach")
    println(myDataStructure.getAllItems())
    if (myDataStructure.contains("apple")){
        println("apple exist in data structure ")
    }else{
        println("does not exist")
    }

}