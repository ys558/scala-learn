/*
* scala 包的定义，除了像JAVA一样，用文件夹，如com.companyName.scala.Inner之外
* 还有另一种更为灵活的方法，直接用嵌套，如：
! 注意，这里如果用intelliJ的话，会有编辑器的警告，红色下划线，这是编辑器支持不够所致，并不是语法本身问题：
* 实际工作中，仍推荐采用JAVA风格的包引入方式
* */

package com {

  // 访问内层对象Inner，需要import：
  import com.companyName.scala.Inner

  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(s"内层包：${Inner.in}") // 内层包：in
    }
  }

  package companyName {
    package scala {
      object Inner {
        var in: String = "in"
        def main(args: Array[String]): Unit = {
          println(s"外层包：${Outer.out}") // 外层包：out
        }
      }
    }
  }
}