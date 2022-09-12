package pkg

object closuers {
  // Closuer is function which uses one or more argument defined outside the function.
  // impure closuer is the variable defined is var i.e. it can be changed inside and outside the function
  // pure closure is when the variable defined is val i.e. it can not be changed inside and outside the function
  
  var a = 10;  
  val b = 15
  val add = (x:Int) => x+a
  
  val add2 = (x:Int) => {
    a = x+a
    a
    }
  
  val add3 =(x:Int) => x+b
  
  def main(args :Array[String]){
    
    println(add(25))
    a = 100
    println(add(35))
    
    println(add2(25))// this will change the value of a as closure updating value of a
    println(add2(35))
    
     println(add3(35))// this is calling pure closure
  }
}