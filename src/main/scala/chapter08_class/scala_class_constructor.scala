package chapter08_class

object scala_class_constructor {
  def main(args: Array[String]): Unit = {
    // 1. 无传参参构造函数：
    var s = new Student
    println(s"Stundent name is ${s.name}, age is ${s.age}")

    // 2.
    val s2 = new Student2(name="Bob", age=10)
    println(s"student2 name is ${s2.name}, age is ${s2.age}")

    // 3.
    val s3 = new Student3(name = "bbb", age = 1, school = "abc")
    s3.printInfo()
  }
}

// 1. 无传参参构造函数：不推荐
class Student {
  var name: String = _;
  var age: Int = _;
}

// * 2. 传参构造函数：推荐
class Student2 (var name: String, var age: Int)

// * 3. 增加构造参数
class Student3 (var name: String, var age: Int) {
  var school: String = _
  def this(name: String, age: Int, school: String) {
    this(name, age)
    this.school = school
  }
  def printInfo(): Unit = {
    println(s"student4: name=${name}, age=$age school=$school")
  }
}