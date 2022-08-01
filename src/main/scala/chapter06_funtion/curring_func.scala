package chapter06_funtion

object curring_func {
  def main(args: Array[String]): Unit = {
    // 函数的嵌套与柯理化
    def fn(i: Int): String => (Char => Boolean) = {
      def fn1(s: String): Char => Boolean = {
        def fn2(c: Char): Boolean =  {
          if (i==0 && s=="" && c=='0') false else true
        }
        fn2
      }
      fn1
    }
    println(fn(0)("")('0')) // false
    println(fn(1)("")('2')) // true

    // 上面这种函数的调用判断类型的时候显得很累赘，可以用scala的类型推断和函数嵌套进行改写，如下：
    val fn3 = (i: Int) => (s: String) => (c: Char) => if (i==0 && s=="" && c=='0') false else true
    println(fn3(0)("")('0')) // false
    println(fn3(2)("a")('0')) // true

    // ! 上面的这种，函数的嵌套里，内层函数调用外层函数定义的局部变量，就是闭包


  }
}
