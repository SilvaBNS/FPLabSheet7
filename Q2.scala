object Q2 {
  def main(args:Array[String]){
    def calculateSquare(numbers:List[Int])= {

      numbers.map(num=>num*num)
    }

    val inputs = List(1, 2, 3, 4, 5)
    val outputs = calculateSquare(inputs)
    println("Squares Are : " + outputs)
  }

}
