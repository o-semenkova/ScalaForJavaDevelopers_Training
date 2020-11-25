// public boolean isEven(int number) {
//   return number % 2 == 0;
// }

// ";" should not be used
def isEven(num: Int): Boolean = ???
// todo: show type interference

isEven(4)
isEven(7)

// no need for return statement

def calculateHypotenuse(a: Int, b: Int): Double = {
  val aS = a * a
  val bS = b * b
  Math.sqrt(aS + bS)
}