import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer

object SumOfVectors {
  def sumOfVectors(source1: Array[Int], source2: Array[Int]): Array[Int] = {
    if (source1.size != source2.size) return source1
    val result = ArrayBuffer[Int]()
    for(i <- 0 until source1.size) result += source1(i) + source2(i)
    result.toArray
  }

  @tailrec
  def sumOfVectorsTailRec(source1: Array[Int], source2: Array[Int],
                          result: ArrayBuffer[Int] = ArrayBuffer[Int](), index: Int = 0): Array[Int] = {
    if(source1.size != source2.size) return source1
    if(source1.size <= index) return result.toArray
    sumOfVectorsTailRec(source1, source2, result += source1(index) + source2(index), index + 1)
  }
}