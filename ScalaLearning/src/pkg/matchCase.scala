package pkg

object matchCase {
  def main(args: Array[String]) {
    val age = 30
// test 
    age match {
      case 20 => println(age)
      case 18 => println(age)
      case 30 => println(age)

    }
    val v = "50"

    v match {
      case "20" => println(v)
      case "18" => println(v)
      case "30" => println(v)

      case _    => println("default")
    }

    val i = 7

    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8     => println("even")
    }

    val result = i match {
      case 1 | 3 | 5 | 7 | 9 => "odd"
      case 2 | 4 | 6 | 8     => "even"
    }

    println("i is " + result)

    var count = 0

    count match {
      case 1 => {
        println("Lonley")
      }
      case x if x == 2 || x == 3 => {
        println("something")
      }

      case x if x > 3 => {
        println("nothing")
      }

      case _ => {
        println("it seems 0 or less")
        println("provide another number")
        count += 1
        println("count - " + count)
      }
    }

    val j = 16
    j match {
      case a if 0 to 9 contains a   => println("0-9 range: " + a)
      case b if 10 to 19 contains b => println("10-19 range: " + b)
      case c if 20 to 29 contains c => println("20-29 range: " + c)
      case _                        => println("Hmmm...")
    }

  }
}