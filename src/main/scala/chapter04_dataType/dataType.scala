package chapter04_dataType

object dataType {
  def main(args: Array[String]): Unit = {
    val a: Byte = 10
    // scala里的数值默认为Int类型，如果要指定类型，则需进行强制转换.toByte：
    // val c: Byte = 20 + a // error

    val b: Byte = (20 + a).toByte
    println(b)

    // Long类型写法，可省略Long, 但数值后面必须加上L
    val l = 2489247298472987l
    println(l)

    // Float类型，同样的，可省略Float, 但数值后面必须加上f，浮点类型默认类型为Double，
    val f = 2.343f
    println(f)

    // char: 单个字符，单引号括起来
    val c = '和'
    println(c)
    // 将char字符转换为Int，则打印出对应ASCII码
    val i: Int = c
    println(i) // 21644
    val i2: Char = (i +1).toChar
    println(i2) // 咍

  }
}
