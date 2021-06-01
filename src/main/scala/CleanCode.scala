class CleanCode {

  def MinValue(NumbersArray: Array[Int], Number: Int): Int = {

    var value = NumbersArray(0)
    for (i <- 1 until Number) if (NumbersArray(i) < value) value = NumbersArray(i)
    return value
  }

  def MaxValue(NumbersArray: Array[Int], Number: Int): Int ={

    var value = NumbersArray(0)
    for(i <- 1 until Number) if (NumbersArray(i) > value) value = NumbersArray(i)
    return value
  }

}


object myCleanCodeAssignment{

  def main(args: Array[String]): Unit = {

    val ClassObject = new CleanCode

    val ArrayOfNumbers = Array(1000, 11, 445, 1, 330, 3000)
    val InputNumber  = 6

    println( "MinimumValue" + " = " + ClassObject.MinValue(ArrayOfNumbers,InputNumber))
    println( "MaximumValue" + " = " + ClassObject.MaxValue(ArrayOfNumbers,InputNumber))
  }
}
