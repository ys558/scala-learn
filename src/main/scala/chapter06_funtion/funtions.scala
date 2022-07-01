package chapter06_funtion

object funtions {
  def main(args: Array[String]): Unit = {
    // 1. 和JAVA不同，scala中函数是一等公民，main函数里可以再次套用函数
    def sayHi(name:String): String = {
      s"$name say hi"
    }
    println(sayHi("xxx"))

    // 2. 可变参数：传参类型后加*
    // 注意！如有多个传参，可变传参应放在最后：
    def f1(num1: Int, num: Int*): String = {
      s"$num1 $num"
    }
    // 可变参数传入为集合类型
    println(f1(1,23,4))
    // 1 WrappedArray(23, 4)

    // 3. 默认值
    def f2(name: String="s", age: String):String = s"$name is $age"
    // 函数自身带默认值传参时，如果不传默认值的值，则须定义那些不用默认值的变量名：
    println(f2(age ="haha"))
    // s is haha

    // 4. 函数至简原则，能省则省：
    // 4.1 函数中的return可省略
    // 4.2 函数体只有一行表达式，花括号可省略
    // 4.3 函数返回值类型可省略，当其省略时，return也必须一并省略：
    def f3(name: String="s", age: String) = s"$name is $age"
    // 4.4 =可省略，但=省略时函数返回值类型也不能出现，这种函数被被定义为过程函数：
    def f4(name:String) {
      println(s"$name")
    }
    println(f4("test")) // ()
    f4("test") // test

    // 4.5 函数无传参时，调用时可不写括号：
    def f5() = println("无参函数")
    f5 // 无参函数

    // 4.6 无参函数定义时可以不写小括号()，如不写小括号，那么调用时也不能加小括号()
    def f6 = println("不写小括号函数")
    f6 // 不写小括号函数

    // 4.7 匿名箭头函数，def也可以省略，调用见文件 Lamda_func.scala
    (des:String)=> println(s"$des")
  }
}
