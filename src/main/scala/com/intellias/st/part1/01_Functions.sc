// public boolean isEven(int number) {
//   return number % 2 == 0;
// }

// ";" should not be used
def isEven(num: Int) = num % 2 == 0
// todo: show type interference

isEven(4)
isEven(7)

// no need for return statement

def calculateHypotenuse(a: Int, b: Int) = {
  val aS = a * a
  val bS = b * b
  Math.sqrt(aS + bS)
}

val h = calculateHypotenuse(3, 4)
var h2 = calculateHypotenuse(3, 4)
h2 = 4
h2