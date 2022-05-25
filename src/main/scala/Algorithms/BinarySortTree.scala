package Algorithms

import scala.collection.mutable

class BinarySortTree[K, V](comp:(K, K) => Int) extends mutable.Map[K, V] {
  class Node(var key: K, var value: V, var left: Node, var right: Node)

  private var root: Node = null


  def subtractOne(elem: K) = {
    this
  }

  def addOne(elem: (K, V)) = {
    this
  }

  def get(key: K): Option[V] = {
    var rover = root
    var c = if (rover.key != null) comp(key, rover.key) else 0
    while(rover != null && c != 0) {
      rover = if (c < 0) rover.left else rover.right
      c = if (rover.key != null) comp(key, rover.key) else 0
    }
    if (rover == null) None else Some(rover.value)
  }
  def iterator: Iterator[(K, V)] = ???
}
