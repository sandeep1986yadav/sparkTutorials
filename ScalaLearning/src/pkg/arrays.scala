package pkg

import Array._
object arrays {

  val a1: Array[Int] = new Array[Int](3);
  val a2 = new Array[Int](4)
  var a3 = Array(1, 2, 3, 4)
  val a4 = new Array[Boolean](2)
  def main(args: Array[String]) {
    a1(0) = 10
    a1(1) = 20
    a1(2) = 30

    println(a1)
    // a1 = a2 not possible as defined as val

    for (x <- a1) {
      println(x)
    }
    a1(0) = 11 // reassigning value to a1(0)
    for (i <- 0 to (a1.length - 1)) {
      println(a1(i))
    }
    for (x <- a2) {
      println(x)
    }
    for (x <- a4) {
      println(x)
    }

    a3 = a1 // possible as a3 is var
    for (x <- a3) {
      println(x)
    }
    val result = concat(a1, a2)
    for (x <- result) {
      println(x)
    }
    println("applied -" + a1.apply(0) == 11)
    println("applied -" + (a1.apply(0) == 11))
    if (a1.apply(0) == 11) {
      println("worked")
    }
    for (x <- a1) {
      println(x)
    }
    val k = a1.collect({ case x: Int => x * 10 })
    for (x <- k) {
      println(x)
    }
    val j = a1.collectFirst({ case i: Int => i * 10 })
    println(j)

    val jj = 0 +: a1 :+ 99

    for (x <- jj) {
      println("jj - " + x)
    }

    val ii = a1 :+ a2

    for (x <- ii) {
      println("ii - " + x)
    }
    val kk = a1 ++ a2

    for (x <- kk) {
      println("kk - " + x)
    }
  }
}