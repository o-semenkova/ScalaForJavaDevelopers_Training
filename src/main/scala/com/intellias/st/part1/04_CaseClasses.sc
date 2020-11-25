// val
// apply and unapply
// copy
// equals
// hasCode
// toString

case class Car(model: String, year: Int)

// todo: copy

// todo: equals

// todo: apply

// todo: simple pattern matching

// ADT: T1 | T2
sealed trait Person {
  def name: String
}

case class Student(name: String, score: Int) extends Person

case class Teacher(name: String, subject: String) extends Person

case class Aspirant(name: String, subject: String) extends Person

// there is no fields in scala
