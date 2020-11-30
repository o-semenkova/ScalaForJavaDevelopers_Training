// VERY USEFUL
// show/hide implicits: Ctrl + Alt + Shift + '+'/'-'
//

import java.util
// Implicits:

// 1. conversions
case class Person(name: String, age: Int)

def show(objToShow: String): Unit = println(objToShow)

val ivan = Person("Ivan", 30)

// todo: make next work not touching it
implicit val str: String = "test"
implicit def person2String(person: Person)(implicit t: String): String = person.toString
show(ivan)
val s: String = ivan


// Enriching objects
// todo add method reverse for java list
implicit class RichList(val javaList: java.util.List[_]) extends AnyVal {
  def reverse: java.util.List[_] = javaList
}

val strings: util.List[String] = new util.ArrayList[String]()
strings.reverse

// Implicits are used when
// 1. there is a different type of the expression than expected
// 2. Nonexistent member is accessed
// 3. Argument doesn't match the parameter

implicit val a: Int = 3
implicit val d: Double = 3.0

def calc(x: Int)(implicit y: Int, z: Double) = x + y

calc(5)


// todo: try to implement trinary operator

//booleaExpression ? (ifTrue, else)

implicit class TrinaryBoolean(simpleBoolean: Boolean) {
  def ?[T](t: (T, T)): T = if (simpleBoolean) t._1 else t._2
  def ?:[T](t: (T, T)): T = if (simpleBoolean) t._1 else t._2
}

false ? ("Yes" -> "No")
("Yes" -> "No") ?: false
