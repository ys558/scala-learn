package chapter05_processControl

import scala.io.StdIn

object ifELseControl {
  def main(args: Array[String]): Unit = {
    println("请输入年龄数字：")
    val age = StdIn.readInt()

    if ( age >= 18 ) {
      println("成年")
    }else if (age > 0 && age < 18){
      println("未成年")
    }else{
      println("输入不合法")
    }

    // 另一种写法：
    val result: String = if ( age >= 18 ) {
      "成年"
    }else if(age > 0 && age < 18){
      "未成年"
    }else{
      "输入不合法"
    }
    println("result: "+result)

    // scala没有三元运算符，但条件语句还可以写在一行：
    val result2: String = if (age >=18) "成年" else if (age > 0 && age < 18) "未成年" else "输入不合法"
    println("result2："+result2)
  }
}
