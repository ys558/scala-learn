package chapter01

// ()里的构造函数，可直接定义为变量(var)或常量(val)，给外部传入的值给一定的限制：
class Student(val name: String,  var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + "in School: " + Student.school)
  }
}

// 引入伴生对象：对应上面的 Student.school
object Student {
  // 这里定义公用属性school字段
  val school: String = "xyz"

  def main(args: Array[String]): Unit = {
    val Alice = new Student(name = "Alice", age = 18)
    Alice.printInfo()

    val Bob = new Student(name = "Bob", age = 20)
    Bob.printInfo()
  }
}