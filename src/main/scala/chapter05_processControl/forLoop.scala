package chapter05_processControl

import scala.collection.immutable
import scala.util.control.Breaks

object forLoop {
  def main(args: Array[String]): Unit = {
    // 1. 范围遍历：起始位置 to 结束位置（含）by 步长
    for (i <- 1 to 3 by 1 reverse) {
      println(i)
//      3
//      2
//      1
    }
    // 2. 范围遍历2：Range(起始位置，结束位置（不含），步长)
    for (i <- new Range(1, 3, 1) reverse) {
      println(i)
      // 2
      // 1
    }
    // 3. 范围遍历3：起始位置 until 结束位置（不含）by 步长
    for (i <- 1 until 3 by 1){
      println(i)
      // 1
      // 2
    }

    // 4. 步长可以定义为浮点数，但前面范围的数也必须定义为浮点数，否则报错：
    val a: BigDecimal = 1.0
    val b: BigDecimal = 2.0
    for (i <- a to b by 0.3) {
      println(i)
      // 1.0
      // 1.3
      // 1.6
      // 1.9
      // 2
    }

    // 5. 集合遍历: Array, List, Set 均可遍历
    for (i <- Array(2,3,4)) {
      println(i)
      // 2
      // 3
      // 4
    }

    // 6. 循环守卫
    // scala里没有 continue 关键字，利用循环守卫来实现：
    for ( i <- 1 to 4 if i != 3) {
      println("循环守卫："+i)
//      循环守卫：1
//      循环守卫：2
//      循环守卫：4
    }

    // 循环嵌套
    // 乘法口诀表：
    for (i <- 1 to 9) {
      for(j <- 1 to i) {
        print(s"$j*$i=${i*j} ")
      }
      println()
    }
    // 两个循环可写在一个for表达式里，用;隔开即可
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j*$i=${i * j} ")
      if (i == j) println()
    }

    // 6. 引入变量, 下面定义的j由i生成，可写在for循环里：
    for(i <- 1 to 3; j = 4 - i) {
      println(s"i=$i j=$j")
    }
    println("----------------")
    // 也可以写为：
    for {i <- 1 to 3; j = 4 - i} {
      println(s"i=$i j=$j")
    }
    println("----------------")
    // 上面的2种式子等价于：
    for (i <- 1 to 3) {
      val j = 4 - i
      println(s"i=$i j=$j")
    }

    // 7. 循环的返回值，用于对集合里的每个数据进行操作，如：
    val result: immutable.IndexedSeq[Int] = for(i <- 1 to 3) yield i*i
    // Vector(1, 4, 9)

    // 8. 退出循环，Break类
    for ( i <- 0 to 5) {
      if (i == 3) Breaks.breakable()
      println(i)
    }

    // 当然，也可以用try catch方法，但这种方法写法比较冗余，不推荐：
    try{
      for (i <- 0 until 5) {
        if (i == 3) throw new RuntimeException()
        println(i)
      }
    } catch {
      case e: Exception =>
    }
  }
}
