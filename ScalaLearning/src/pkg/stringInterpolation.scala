package pkg

object stringInterpolation {
  def main(args :Array[String]){
    
    val name = "Sandeep"
    val age = 35
    val sal = 12.5
    
    println(name + " is " + age +" years old and earning " + sal + " monthy")
    println(s"$name is $age years old and earning $sal monthly")
    println(f"$name%s is $age%d years old and earning $sal%f monthly")
    println(s"Hello \n\tWorld!")
    println(raw"Hello \nWorld!")
    println("hi \n" + raw"Hello \nWorld!")
  }
}