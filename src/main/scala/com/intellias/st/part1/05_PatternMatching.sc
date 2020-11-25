// Pattern matching on Strings
"one" match {
  case "one" => println("one")
  case "two" => println("two")
  case "three" => println("three")
}

// Pattern matching on case classes
sealed trait Person {
  def name: String
}

case class Student(name: String, score: Int) extends Person

case class Teacher(name: String, subject: String) extends Person

case class Aspirant(name: String, subject: String) extends Person

//todo simple pattern matching

// Pattern matching on Option classes
// Option
//   Some
//   None
val maybeString = Option("I'm here")

//  Pattern matching on Lists
// todo: implement your own list before!
val l1 = List(1, 3, 5)
val l2 = 1 :: 3 :: 5 :: Nil

val head :: tail = l1

l2 match {
  case head :: tail => println(s"head is $head")
  case Nil =>
}


