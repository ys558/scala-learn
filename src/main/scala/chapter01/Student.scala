package chapter01

class Student(name: String, age: Int) {
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