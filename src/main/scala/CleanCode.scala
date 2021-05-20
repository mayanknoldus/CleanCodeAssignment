class CleanCode {

  class parameters {
    var firstvalue = 0
    var secondvalue = 0
  }

    def MinimumMaximumValue(arrayofnumbers: Array[Int], Inputnumber: Int): parameters  = {

      if (Inputnumber == 1) forValue1(arrayofnumbers)
      else {
        val ValueForRemaining = forRemaining(arrayofnumbers)

        for (i <- 2 until Inputnumber) {
          if (arrayofnumbers(i) < ValueForRemaining.firstvalue) ValueForRemaining.firstvalue = arrayofnumbers(i)
          else if (arrayofnumbers(i) > ValueForRemaining.secondvalue) ValueForRemaining.secondvalue = arrayofnumbers(i)
        }
        return ValueForRemaining
      }
    }


    def forValue1(numberarray:Array[Int]) : parameters  = {

      val parametersObjectValue1 = new parameters
      parametersObjectValue1.firstvalue = numberarray(0)
      parametersObjectValue1.secondvalue = numberarray(0)
      return parametersObjectValue1
    }


    def forRemaining(numbersarray:Array[Int]) : parameters  = {

      val parametersObjectRemaining = new parameters

      if (numbersarray(0) > numbersarray(1)) {
        parametersObjectRemaining.firstvalue = numbersarray(0)
        parametersObjectRemaining.secondvalue = numbersarray(1)
      }
      else {
        parametersObjectRemaining.firstvalue = numbersarray(1)
        parametersObjectRemaining.secondvalue = numbersarray(0)
      }

      return parametersObjectRemaining
    }

}


object myCleanCodeAssignment{

  def main(args: Array[String]): Unit = {

    val CleanCodeObject = new CleanCode

    val ArrayOfNumbers = Array(1000, 11, 445, 1, 330, 3000)
    val InputNumber  = 6
    val FinalResult  =  CleanCodeObject.MinimumMaximumValue(ArrayOfNumbers, InputNumber)
    println( "MinimumValue"-> FinalResult.firstvalue)
    println( "MaximumValue"-> FinalResult.secondvalue)
  }
}
