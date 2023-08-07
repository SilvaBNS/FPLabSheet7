object Q3 {

  def main(args:Array[String]){

    def isPrime(num: Int): Boolean = {
      if (num <= 1) return false
      if (num == 2) return true
      if (num % 2 == 0) return false

      var a = 3
      while (a * a <= num) {
        if (num % a == 0) return false
        a += 2
      }

      true
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
      numbers.filter(num => isPrime(num))
    }

    val inputs = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputs = filterPrime(inputs)
    println(outputs)


  }
}
