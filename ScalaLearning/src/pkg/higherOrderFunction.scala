package pkg

object higherOrderFunction {
  def math(f:(Double,Double)=>Double,x:Double, y:Double) =f(x,y)
  def math1(f:(Double,Double)=>Double,x:Double, y:Double,z:Double) =f(f(x,y),z)
  def executeNTimes(f:()=>Unit,n:Int) = {
    for (i <- 1 to n)
    f()
  }
  def helloWorld():Unit = println("Hello Method")
  
  def main(args:Array[String]){
    var result = math((x,y)=>x+y,5,6)
    println(result)
    //Added
    result = math(_+_,5,6)
    println(result)
    
    result = math((x,y)=>x-y,5,6)
    println(result)
     result = math(_-_,5,6)
    println(result)
    result = math((x,y)=>x*y,5,6)
    println(result)
    
    result = math((x,y)=>x min y,5,6)
    println(result)
    
    result = math(_ min _,5,6)
    println(result)
    
    result = math1((x,y)=>x max y,5,6,7)
    println(result)
    
    executeNTimes(() => println("Hello world"), 3)
    executeNTimes(helloWorld, 3)
  }
}