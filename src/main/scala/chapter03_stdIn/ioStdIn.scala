package chapter03_stdIn

import scala.io.StdIn

object ioStdIn {
  def main(args: Array[String]): Unit = {
    println("请输入姓名：")
    var name = StdIn.readLine()
    println("请输入年龄：")
    var age = StdIn.readInt()

    println(s"您输入了姓名：${name}, 年龄：${age}")
  }
}
