import org.scalatest.funsuite.AnyFunSuite

class ExpansionOfMethodSpec extends AnyFunSuite {

  test("Test for addition of two numbers ") {
    assert(ExpansionOfMethod.expansionOfAdditionTwoNumbers(14,5) === 19)
  }

  test("Test for Sum of list elements") {
    val inputList = List(5, 2, 3, 4)
    assert(ExpansionOfMethod.expansionOfSumOfList(inputList) == 14)
  }

  test("Test for Sum of negative elements in List ") {
    val inputList = List(-5, 2, -3, 4)
    assert(ExpansionOfMethod.expansionOfSumOfList(inputList) == -2)
  }

  test("Test for Higher Order Function"){
    val square: Int => Int = x => x * x
    assert(ExpansionOfMethod.expansionOfHigherOrderFunction(square,5) == 25)
  }
}
