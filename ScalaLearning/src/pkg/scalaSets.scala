package pkg
/*
 * Sets are unique not duplicate value in set
 * Set are of two type mutable and immutable. Object can not be changed for immutable
 * Set is ordered in scala i.e. you can say which value will go on which place
 * when you give set1(8), it checks value 8 present in set or not and returns boolean
 * */
object scalaSets {
  val set1 : Set[Int] = Set(1,2,3,4,5,5)
  val set2 = Set("Sandeep","Ram","KK")
  val set3 = Set(1,2,3,"Sandeep","Ram","KK")
  var set4 = scala.collection.mutable.Set(1,2,3,4)
  def main(args:Array[String]){
    //set1 = set2 // Not allowed as immutable
   // set4 = set1 // not allowed as set1 is immutable
    set4 = scala.collection.mutable.Set(2,4,7,8) // Allowed as mutable
    
    println(set1)
    println(set1 +10)
    println(set1) // set 1 value will not changes as immutable
    println(set4 + 10)
    println(set4) // set 4 will not change it created new set
    
    set4.add(20)
    println(set4) // added an element as mutable
    
    println(set2("Sandeep"))
    println(set1(30))
    
    println(set1.head)
    println(set1.tail)
    println(set1.isEmpty)
    
    println(set1 ++ set2)
    println(set1.++(set4))
    
     println(set1.&(set4)) // gives intersection
     println(set1 ++: set2)
     println(set1.intersect(set4))
     
     set1.foreach(println)
     
     for(name <- set2){
       println(name)
     }
    
  }
}