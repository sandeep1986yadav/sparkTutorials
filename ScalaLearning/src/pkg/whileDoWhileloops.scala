package pkg

object whileDoWhileloops {
  def main(args: Array[String]) {
    var x = 0;

    while (x < 3) {
      println("x is " + x)
      x += 1 // x = x+1
      // x++, x--, --x, ==x not allowed in scala
    }

    var y = 0;
    do { //Execute atleast once even though while condition is false
      println("y is " + y)
      y += 1 
    } while (y < 0)

  }
}