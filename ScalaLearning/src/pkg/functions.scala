package pkg

object functions {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y
    }

    def square(x: Int) = x * x
    
    def **(x:Int, y:Int) = x*y // ** is not operator overloading it is function definition 
  }
  def add(x: Int, y: Int): Int = {
    return x + y
  }
  def substract(x: Int, y: Int): Int = {
    x - y
  }

  def multiply(x: Int, y: Int): Int = x * y

  def devide(x: Int, y: Int) = x / y

  val addition = (x:Int, y:Int) => x+y
  
  // Function with no return type
  def printx(x:Int) : Unit={
    println(x)
  }
  
  def +(x:Int, y:Int) = x+y // + is not operator overloading it is function definition 
  
  def **(x:Int, y:Int) = x*y 
  
  def main(args: Array[String]) {

    println(add(45, 15))
    println(substract(45, 15))
    println(multiply(45, 15))
    println(devide(45, 15))
    println(devide(45, 14))

    println(Math.add(45, 15)) // function inside object
    println(Math.square(45))
    
    println(Math square 45)
    println(Math add(45, 15))
    
    println(addition(10,24))// Anonymous function
    
    printx(10)
    
    println(functions.+(2,4))
    
    println(Math.**(2,4))
    
    println(**(2,4))
  }
}