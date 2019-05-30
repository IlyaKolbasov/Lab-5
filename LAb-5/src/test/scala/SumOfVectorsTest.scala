import org.scalatest.FunSuite

class SumOfVectorsTest extends FunSuite {
  val testVector1 = Array(1,2,3); val testVector2 = Array(1,2,3)
  val testVector3 = Array(0)
  val expected1 = Array(1,2,3)

  test("Test sumOfVectorsTailRec") {
    assert(expected1.equals(SumOfVectors.sumOfVectorsTailRec(testVector1, testVector2)))
  }

  test("test sumOfVectors") {
    assert(expected1.equals(SumOfVectors.sumOfVectors(testVector1, testVector2)))
  }

  test("Test sumOfVectorsTailRec for vectors of different sizes") {
    assert(testVector1.equals(SumOfVectors.sumOfVectorsTailRec(testVector1, testVector3)))
  }

  test("test sumOfVectors for vectors of different sizes") {
    assert(testVector1.equals(SumOfVectors.sumOfVectors(testVector1, testVector3)))
  }
}