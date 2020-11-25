// todo: constructor (default, primary, auxiliary)
// todo: no static
/*public*/ class Person(val name: String, age: Int) {

  println(name)

}

// companion object
object Person {
}

val p: Person = new Person("Ivan", 30)

// static in Singleton
//
object Intellias {
  def hire(p: Person) = ???
}

Intellias.hire(p)


