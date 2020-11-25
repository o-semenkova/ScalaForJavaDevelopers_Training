// val
// apply and unapply
// copy
// equals
// hashCode
// toString

case class Car(model: String, year: Int)
val car = Car("Tesla", 2020)
// todo: copy
car.copy(year = 2019).copy(model = "Audi")

// todo: equals
car == Car("Tesla", 2020)

car.eq(Car("Tesla", 2020))
car eq Car("Tesla", 2020)
// todo: apply

// todo: simple pattern matching
val Car(currModel, currYear) = car

// ADT: T1 | T2
sealed trait Person {
  def name: String
}
case class Student(name: String, score: Int) extends Person
case class Teacher(name: String, subject: String) extends Person
case class Aspirant(name: String, subject: String) extends Person

// there is no fields in scala
