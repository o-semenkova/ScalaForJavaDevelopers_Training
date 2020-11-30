package com.intellias.st.part2

// ADT

sealed trait JsonExpression

case class JsonObject(map: Map[String, JsonExpression]) extends JsonExpression

case class JsonNumber(number: Int) extends JsonExpression

case class JsonString(str: String) extends JsonExpression


object JsonSerializer {

  def serialize(jsonExpression: JsonExpression): String = jsonExpression match {
    case JsonObject(map) => "{ " +
      map.map { case (key, expression) => s"$key: ${serialize(expression)}" }.mkString(", ") +
      " }"
    case JsonNumber(number) => number.toString
    case JsonString(str) => s""""$str""""
  }

  // T: Json for T exists implicit Json[T]
  //  def serialize[T](value: T)/*(implicit jsonConverter: Json[T])*/: String =
  def serialize[T: Json](value: T): String = serialize(implicitly[Json[T]].toJson(value))

}
