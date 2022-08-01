package chapter07_package

// 通配符：导入所有工具
import java.util._
// 导入多个类：

// 别名：
import java.util.{ArrayList => JL}

object commonPackage {
  def main(args: Array[String]): Unit = {
    println(s"在包对象里的公用变量值：$commonValue") // xyz
  }
}