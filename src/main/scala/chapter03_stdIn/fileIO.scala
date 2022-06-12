package chapter03_stdIn

import java.io.{File, PrintWriter}
import scala.io.Source

object fileIO {
  def main(args: Array[String]): Unit = {
    // 1. 从文件中读取数据
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    // 2. 将数据写入文件
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala")
    writer.close()
  }
}
