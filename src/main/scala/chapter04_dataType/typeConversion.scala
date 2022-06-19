package chapter04_dataType

/*
* 自动数据类型转换核心, 数据类型精度提升:
* byte -> short -> int -> long
* char -> int
* */
object typeConversion {
  def main(args: Array[String]): Unit = {
    // 自动类型转换
    val a1: Byte = 10
    val b1: Long = 30
    val result1: Int = (a1 + b1.toInt) // b1 强制转换
    println(result1)

    val a2: Byte =10
    val b2: Int = a2
    val c2: Byte = b2.toByte // Int比Byte范围大，需要强转

    // 强制类型转换
    val n1: Int = -2.9.toInt
    // 只取整数部分：
    println(n1) // -2

    // Int -> String
    val s: Int = 99
    val s2: String = s.toString
      // 或：
    val s1: String = s + ""
    println(s1)

    // String -> Int
    val m: Int = "12".toInt

    // 可以链式调用进行两次转换：
    val f2: Int = "123.824".toDouble.toInt // 123
    println(f2)

    var n: Int = 130
    var b: Byte = n.toByte
    // 强转会发生溢出：Byte的范围是-128到127
    println(b) // -126
  }
}
