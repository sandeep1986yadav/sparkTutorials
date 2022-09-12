package pkg

object forloops {
  def main(args: Array[String]) {
    for (i <- 1 to 3) {
      println("i using to - " + i)
    }
    for (i <- 1.to(3)) {
      println("i using to - " + i)
    }
    for (i <- 1 until 3) {
      println("i using until - " + i)
    }
    for (i <- 1.until(3)) {
      println("i using until - " + i)
    }
    for (i <- 1 to 3; j <- 1 to 2) {
      println("i and j using nested - " + i + " " + j)
    }

    for (i <- 1 to 3; if (i > 1)) {
      println("i using filter - " + i)
    }

    val lst = List(1, 2, 3, 45, 33, 44, 6, 7)
    for (i <- lst) {
      println("i using list - " + i)
    }
    for (i <- lst; if i < 6) {
      println("i using list filter - " + i)
    }

    // for as expression
    var v = for { i <- lst; if i < 6 } yield {
      i * 10
    }
    println(v)

    v = for {
      i <- lst
      if i < 6
    } yield {
      i * i
    }
    println(v)
  }
}