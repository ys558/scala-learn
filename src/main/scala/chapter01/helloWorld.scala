package chapter01

/*
* object: 声明一个单例对象，全局只有一个object
* */
object helloWorld {
  // main: 外部可直接调用的方法
  def main(args: Array[String]): Unit = {
    println("hello world!")
    System.out.println("hello Java")
  }
}
