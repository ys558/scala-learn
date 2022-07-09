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

    // apply方法：
    // 例如输出字符串第几个位置的符号：
    val e = "呵呵，你好"(3)
    val g = BigInt("2343423234") // 2343423234
    println(e) // 你
    println(g)
    // * 上面这些方法，均是.apply() 方法的简写
    val f = "来啊，相互伤害啊".apply(4)
    val h = BigInt.apply("234234234")
    println(f) // 互
    println(h) // 234234234



  }
}
