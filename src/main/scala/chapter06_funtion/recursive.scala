package chapter06_funtion

import scala.annotation.tailrec

object recursive {
  def main(args: Array[String]): Unit = {
    // 实现5的阶乘 5!
    // 用循环：
    val factByLoop = (n: Int) => {
      var result = 1
      for (i <- 1 to n) result *= i
      result
    }
    println(factByLoop(5)) // 120

    // 用递归：
    def factByRecursive (n: Int): Int = {
      // * 这里的return不能省，因为不是最后一行：
      if (n == 0) return 1
      factByRecursive(n -1) * n
    }
    println(factByRecursive(5)) // 120

    // ! 递归存在的问题，例如上面的操作，factByRecursive(n -1) * n 最后都要 * n, 导致每一步放入栈中的函数都不同，
    // ! 意味着每执行一步，都会生成一个新的函数出来压在原来的栈上，对栈资源会造成额外开销，必须进行优化

    // ? 递归优化——尾递归调用：
    def factBytailRecursive (n: Int) = {
      // 这个标识符是尾递归调用：
      @tailrec
      def loop(n: Int, currRes: Int): Int = {
        if (n == 0) return currRes
        loop(n -1, currRes*n)
      }
      loop(n, 1)
    }
    println(factBytailRecursive(5)) // 120

  }
}
