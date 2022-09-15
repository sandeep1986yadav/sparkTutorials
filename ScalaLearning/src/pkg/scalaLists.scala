package pkg
/**
 * Scala lists are same as array the diffrence is Array elements
 * are mutable but list elements are immutable
 *
 * and List represents Linked list whereas arrays are flat/
 */
object scalaLists {
  val mylist: List[Int] = List(1, 2, 3, 4, 5)
  val name = List("Sandeep", "Ram", "KK")
  val multiElement = List(1, 2, 3, "Sandeep", "Ram", "KK")
  def main(args: Array[String]) {
    //mylist(0) = 11 // Not allowed as List elements are immutable
    println(0 :: mylist)
    println(mylist)
    println(name)
    println(1 :: 2 :: 3 :: "Sandeep" :: Nil)

    println(mylist.head)
    println(mylist.tail)
    println(name.tail)
    println(name.isEmpty)
    println(name.reverse)
    println(List.fill(5)(2))
    println(List.fill(2, 3, 2)(2))
    println(name.max)
    println(mylist.max)

    mylist.foreach(println)
    var sum = 0
    mylist.foreach(sum += _)
    println(sum)

    println(name.apply(2))
    for (i <- name) {
      println(i)
    }
    
  }
}