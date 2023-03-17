object ExpansionOfMethod {
  //  val additionTwoNumber: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
  val expansionOfAdditionTwoNumbers: Function2[Int, Int, Int] = new Function2[Int, Int , Int] {
    def apply(num1: Int, num2: Int): Int = num1 + num2
  }


  //  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  def expansionOfSumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int]{
    def apply(list: List[Int]): Int = list.sum
  }

  //  val higherOrderFunction: (Int => Int, Int) => Int = (function: (Int => Int), num: Int) => function(num)
  def expansionOfHigherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int]{
    def apply(function: Int => Int, num: Int): Int = function(num)
  }
}
