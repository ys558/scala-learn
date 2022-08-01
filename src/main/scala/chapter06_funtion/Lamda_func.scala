package chapter06_funtion

object Lamda_func {
  def main(args: Array[String]): Unit = {
    // 高阶函数：

    // 1. 调用：给定变量名后再传值：
    val f1: String => Unit = (name: String) => println(s"最初：$name")
    // 直接调用：
    f1("xxx") // xxx

    // 2. 可传入函数后再执行，类似回调函数：
    def newFunc(fn: String => Unit ) = {
      fn("yyyyy")
    }
    // 调用：把上面的f1传入：
    newFunc(f1) // yyyyy

    // 3. 匿名函数的至简原则：
    // 3.1 name 由于是形参，可以任意变换，例如变为xx
    // 3.2 xx的类型定义可省略
    newFunc( xx => println(s"把函数写完整：$xx")) // 把函数写完整：yyyyy
    // 3.3 newFunc如果只有一个操作，例如println(), 传参及箭头也可省略 xx =>, 用通配符下划线_ 代替即可
    newFunc(println(_)) // yyyyy
    // 3.4 newFunc如果只有一个操作，例如println(), 传参及箭头也 xx =>，及通配符下划线_ 均可省略
    newFunc(println) // yyyyy

    // 4. 实例练习：两数操作：
    def dualNums(fn: (Int, Int) => Int): Int = {
      fn(1, 2)
    }

    val add = ( a:Int, b:Int ) => a + b
    val minus = (a: Int, b: Int) => a - b
    println(dualNums(add)) // 3
    println(dualNums(minus)) // -1

    // 简化写法：
    println(dualNums((a, b) => a + b)) // 3

    // 通配符进一步简化：
    println(dualNums(( _ + _ ))) // 3

  }
}