package pkg

import java.util.Date

object partialfunction {
  
  def log(date : Date, message : String)={
    println(date + "----" + message)
  }
  val sum = (x:Int,y:Int,z:Int) => x+y+z
  
  def main(args: Array[String]){
    
    val f = sum(1,2,_ :Int) // Partially called function
    val f1 = sum(1,_:Int,_:Int)
    println(f(3))
    println(f1(4,6))
    //val date = new Date()
    val newlog = log(new Date(),_:String)
    newlog("Message 1")
    newlog("Message 2")
    newlog("Message 3")
    newlog("Message 4")
    newlog("Message 5")
    newlog("Message 6")
    newlog("Message 7")
    newlog("Message 8")
    
    
  }
}