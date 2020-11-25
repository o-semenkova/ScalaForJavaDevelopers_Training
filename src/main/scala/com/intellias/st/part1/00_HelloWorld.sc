object MainViaApp extends App {
  println("Hello World!")
}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }
}

Main.main(Array.empty)

MainViaApp.main(Array.empty)
