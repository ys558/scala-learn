package chapter02_var_val_identifier_String

object stringApi {
  def main(args: Array[String]): Unit = {
    // scala不需要包装类，scala中提供了RichInt，RichDouble, RichChar等Int，Double，Char等原始类不具备的方法：
    val a = 1.toString()
    println(a) // 1
    val aArr = 1.to(5)
    println(aArr) // Range 1 to 5

    // 找出两个字符串中相同的部分：
    val b = "hello".intersect("world")
    println(b) // lo
    val c = "好好学习".intersect("好好工作")
    println(c) // 好好
  }
}
