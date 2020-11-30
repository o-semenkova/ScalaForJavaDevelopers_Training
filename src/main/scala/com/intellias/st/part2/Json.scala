package com.intellias.st.part2

trait Json[T] {
  def toJson(t: T): JsonExpression
}

object Json {

  implicit val personToJson: Json[Person] = person => JsonObject(
    Map(
      "name" -> JsonString(person.name),
      "age" -> JsonNumber(person.age)
    )
  )

  implicit val stringToJson: Json[String] = (str: String) => JsonString(str)

  implicit def tuple2ToJson[T1: Json, T2: Json]: Json[(T1, T2)] = (tupleValue: (T1, T2)) => JsonObject(
    Map(
      "left" -> implicitly[Json[T1]].toJson(tupleValue._1),
      "right" -> implicitly[Json[T2]].toJson(tupleValue._2)
    )
  )

}
