// Pattern matching on Strings
"one1" match {
  case "one" => println("one")
  case "two" => println("two")
  case "three" => println("three")
  case _ =>
}

// Pattern matching on case classes
sealed trait Person {
  def name: String
}

case class Student(name: String, score: Int) extends Person

case class Teacher(name: String, subject: String) extends Person

case class Aspirant(name: String, subject: String) extends Person

val unknownPerson: Person = Teacher("Ivan", "Math")
//todo simple pattern matching
val res = unknownPerson match {
  case teacher@Teacher(name, _) => s"I'm a teacher! My name is $name"
  case _ => "I'm no one"
}

// Pattern matching on Option classes
// Option
//   Some
//   None
val maybeString = Option("I'm here")

maybeString match {
  case Some(value) =>
  case None =>
}

//  Pattern matching on Lists
// todo: implement your own list before!
val l1 = List(1, 3, 5)
val l2 = 1 :: 3 :: 5 :: Nil

val head :: tail = l1

l2 match {
  case head :: tail => println(s"head is $head")
  case Nil =>
}


