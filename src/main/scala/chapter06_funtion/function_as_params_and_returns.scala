package chapter06_funtion
import math._

object function_as_params_and_returns {
  def main(args: Array[String]): Unit = {
    // 1. 函数作为常量的值进行传递
    def fn(n:Int) = {
      println (n)
    }
    // 直接执行：() 括号可省略：
    val result = fn(123)
    result
    // 123

    // 函数作为值进行传递, 采用以下写法：
    val f2 = fn _
    // or
    val f3 = fn(_)
    // or 如果采用以上简写，则须指定函数执行类型，否则报错：
    val f4: Int => Unit = fn
    // 直接打印会打印出函数内存地址：
    println(f2) // chapter06_funtion.Lamda_func$$$Lambda$13/483422889@4c203ea1
    println(f3) // chapter06_funtion.Lamda_func$$$Lambda$14/2088051243@27f674d
    println(f4) // chapter06_funtion.function_as_params$$$Lambda$7/1018547642@d041cf

    // 2. 函数作为参数进行传递
    def dualEval(op:(Int, Int)=> Int, a: Int, b:Int): Int = op(a, b)
    def add  (a:Int, b:Int):Int = a + b

    println(dualEval(add, 22,36)) // 58
    // 直接匿名写法：
    println(dualEval((x,y) => x+y, 2,4)) // 6
    println(dualEval((_ * _), 3,7)) // 21

    // 3. 函数作为函数的返回值
    def f5 () = {
      def f6(a:Int) = println(s"f6被调用了，$a")
      // 外层f5不定义返回值类型，则调用f6就要写成以下形式：
      f6 _
    }
    println(f5()) // chapter06_funtion.function_as_params$$$Lambda$11/2088051243@4c203ea1

    // 调用方法：
    val ff = f5()
    ff(666)// f6被调用了，666

    // 以上调用方法可以简化为：
    f5()(777) // f6被调用了，777

  }
}
