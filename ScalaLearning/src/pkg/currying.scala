package pkg

/*Currying is the technique to make multiple argument function into 
 * single argument function*/

object currying {
  
  def add(x:Int,y:Int) = x+y
  // Added
  def add2(x:Int)=(y:Int)=>x+y // Currying function
  def add3(x:Int)(y:Int)=x+y //Currying function
  
  def add4(x:Int)(y:Int)(z:Int)= x+y+z// multi arg currying function
  
  def main(a :Array[String]){
    
   println(add(10,20))
   println(add2(10)(30)) // Calling currying function
   val sum11 = add2(10)
   println(sum11(14))
   
   println(add3(10)(30))
   val sum22 = add3(10)_ // represents needs more arguments.
   println(sum22(18))
   
   println(add4(1)(2)(3))
   val sum33 = add4(1)_
    println(sum33(1)(2))
   
   val sum44 = add4(1)(11)_
   println(sum44(4))
  }
}