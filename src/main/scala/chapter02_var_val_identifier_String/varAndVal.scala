package chapter02_var_val_identifier_String

import chapter01.Student

object varAndVal {
  def main(args: Array[String]): Unit = {
    //    变量var
    var a: Int = 10
    a = 20
    println("variable a is: " + a)
    //    !赋值时可不声明类型：
    var b = "varibale b"

    //    常量 val
    val c = 20
    println("value b is: " + c)

    //    赋值之前chapter01里的Student类
    var alice = new Student("Alice", age = 18)

    //    如果这里要单独进行赋值，则须在Student类的构造函数中添加var才可进行：
    alice.age = 20

    println(alice.printInfo())

    // 涉及关键字作为变量名可用``圈起来
    val `class` = "class"
    //  特殊符号可作为变量名：
    val +-*/% = "加减乘除百分号"
  }
}
