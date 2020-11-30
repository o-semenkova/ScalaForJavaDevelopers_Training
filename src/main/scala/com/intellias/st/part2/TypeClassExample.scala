package com.intellias.st.part2

object TypeClassExample {

  def main(args: Array[String]): Unit = {
    val json = JsonObject(
      Map(
        "key" -> JsonNumber(5),
        "anotherObject" -> JsonObject(
          Map("name" -> JsonString("Ivan"))
        )
      )
    )

    val serialized = JsonSerializer.serialize(json)
    println(serialized)

    val ivan = Person("Ivan", 30)
    val hanna = Person("Hanna", 31)

    val family: (Person, Person) = (ivan, hanna)



    val serializedIvan = JsonSerializer.serialize(family)
    println(serializedIvan)
    println(JsonSerializer.serialize(("family", (hanna, ivan))))
  }

}

case class Person(name: String, age: Int)
