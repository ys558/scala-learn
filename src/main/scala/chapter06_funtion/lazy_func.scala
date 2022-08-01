package chapter06_funtion

object lazy_func {
  def main(args: Array[String]): Unit = {
    // 1. 懒加载 lazy 关键字，他和其他两种函数定义的方式区别：
    val words = scala.io.Source.fromFile("src/main/scala/chapter06_funtion/1val").mkString
      // ! 定义时就被取值
    lazy val words2 = scala.io.Source.fromFile("src/main/scala/chapter06_funtion/2lazy").mkString
      // ! 首次使用时被取值
    def words3 = scala.io.Source.fromFile("src/main/scala/chapter06_funtion/3def").mkString
      // ! 每一次使用时取值

  }
}
