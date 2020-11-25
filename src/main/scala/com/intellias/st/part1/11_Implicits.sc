// Implicits:

// 1. conversions
case class Person(name: String, age: Int)

def show(objToShow: String): Unit = println(objToShow)

val ivan = Person("Ivan", 30)

// todo: make next work not touching it
//show(ivan)


// Enriching objects
// todo add method reverse for java list
implicit class RichList(val javaList: java.util.List[_]) extends AnyVal {
  def reverse: java.util.List[_] = javaList
}

// Implicits are used when
// 1. there is a different type of the expression than expected
// 2. Nonexistent member is accessed
// 3. Argument doesn't match the parameter

