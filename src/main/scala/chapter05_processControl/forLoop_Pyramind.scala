package chapter05_processControl

object forLoop_Pyramind {
  def main(args: Array[String]): Unit = {
    for (i<- 1 to 9) {
      val stars = 2 * i -1;
      val spaces = 9 - i;
      println(s"${" "*spaces}${"*"*stars}")
    }

    // 上面的式子可以简化成引入变量：
    for (i<- 1 to 9; stars = 2 * i - 1; spaces = 9 -i) {
      println(s"${" "*spaces}${"*"*stars}")
    }
  }
}
