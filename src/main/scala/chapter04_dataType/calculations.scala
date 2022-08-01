package chapter04_dataType

// 整体导入scala内置的数学操作包：._
// 等同于 import scala.math._
import math._

object calculations {
  def main(args: Array[String]): Unit = {
    val r1 = 10 / 3
    println(r1) // 3

    // 如果要精度，则用带小数点的数除即可：
    val r2 = 10.0 / 3
    // %.2f保留2位小数
    println("%.2f".format(r2)) // 3.33

    // == 全等符号, 用法和JAVA有区别，全等不是和JAVA一样判断引用地址，不需要.equals(),
    // 当然 scala 也有.equals()方法, 和java一样的用法
    val s1 = "hola"
    val s2 = new String("hola")
    println(s1 == s2) // true
    // 判断引用地址是否相等：
    println(s1.eq(s2)) // false

    // 位运算
    // << 左移操作，相当于 乘以2的n次方
    val v = 60
    // 60(10) = 0011 1100(2)
    // 左移3，变成
    // 0000 0001 1110 0000(2)
    println(v << 3) // 480

    // >> 右移操作，相当于 除以2的n次方
    // 右移移3，变成 111 (2)
    println(v >> 3) // 7

    // scala中，直接调用方法，而不像java一样进行强制类型转换：
    // ! 一般来讲，没有带括号()的方法，不改变当前对象，
    val d = 99.44.toInt
    println(d) // 99

    // 一些常用的数学操作：
    val a, b, c = sqrt(2); pow(2,4); min(3, Pi)
    println(a, b, c) // (1.4142135623730951,1.4142135623730951,1.4142135623730951)
  }
}
