package pkg

object varunderstandings {
  def main(args: Array[String]):Unit ={
    var a: Int = 20
    
    a = a*20
    
    println(a)
    
    var b = 30 //mutable
    val c = 30.2f // Immutable
    println(b/c)
    
    var i = 30 //mutable
    val j = 20 // Immutable
    println(i.toFloat/j) // this gives Int result
    var d = {
      var a :Int = 30
      var b :Int = 60
      a+b
    }
    println(d)
    
    var e = {
      var a  = 30
      var b  = 600
      a+b
    }
    
    println(e)
    
    var f = {
      val a  = 300
      var b  = 600
      a+b
    }
    println(f)
    
    val g = {val a:Int =40; val b:Int = 25; a*b}
    println(g)
    
    val h  = {val a =40; val b = 25; (a/b)}
    println(h) // Gives Int result
    
     val k  = {var a =40; var b = 25; (a*b)}
    println(h) 
    
    lazy val aa = 120 
    /* Lazy means value will be assingd when we use the variable 
     * Only val can lazy var is not allowed to be lazy initialization
     * */
    println(aa)
    
  }
}