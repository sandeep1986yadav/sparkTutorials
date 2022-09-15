package pkg
/*
 * Map are key value pairs
 * Duplicate keys not allowed in Map
 * if we give duplicate key the last value will be assigned to it.
 * Maps are also mutable and immutable
 * */
object scalaMap {
  val map1: Map[Int, String] = Map(1 -> "sandeep", 2 -> "Ram", 3 -> "KK")
  val map2: Map[Int, String] = Map(1 -> "sandeep", 2 -> "Ram", 2 -> "KK") // KK will be assigned to 2
  def main(args: Array[String]) {
    println(map1)
    println(map2)
    println(map1(2)) // print the value of given key
    println(map1.keys)
    println(map2.values) 
    println(map2.isEmpty)

    map1.foreach(println) // prints each element of Map
    map1.foreach(x => println(x._2)) // Prints value of each map element
    map1.foreach { x => println(x) } //Prints each element of Map
    map1.keys.foreach(x => println(x)) // Prints each key of Map
    map1.keys.foreach(x => println(map1(x))) // Prints value of each Map element
    map1.keys.foreach { key =>
      println("Key -" + key)
      println("Value -" + map1(key))
    }
    println(map1.contains(1))
    println(map1 ++ map2)
    println(map1.size)
  }
}