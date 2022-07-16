/*
* 包对象，Package - Object
* 全局只能有一份，里面的函数和变量为chapter07全局共享
* */

package object chapter07_package {
  val commonValue = "xyz"
  def commonFn (): Unit = {
    println(s"$commonValue")
  }
}

