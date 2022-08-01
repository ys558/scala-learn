package chapter06_funtion

object operation_collection_by_HOF {
  def main(args: Array[String]): Unit = {
    def opArr (arr: Array[Int], op: Int => Int): Array[Int] =
      for ( el <- arr ) yield op(el)

    val targetArr: Array[Int] = Array(12,34,21)

    // 各种定义及操作：
    val addOne = (el: Int) => el + 1
    // 直接打印不行：因为Arr是引用类型，输出内存地址：
    println(opArr(targetArr, addOne)) // [I@17c68925
    println(opArr(targetArr, addOne).mkString(",")) // 13,35,22


  }
}
