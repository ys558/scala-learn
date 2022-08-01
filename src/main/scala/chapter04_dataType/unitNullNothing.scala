package chapter04_dataType

object unitNullNothing {
  def main(args: Array[String]): Unit = {
    // 1. Unit 值为()
    def definitions(): Unit = { }
    println(definitions()) // ()

    // 2. Null 值为null
    var a = null
    println(a)

    // 3. Nothing 所有类型的子类，应用与返回抛出异常时，函数不能返回值时
    def nothingDef(): Nothing = {
      throw new NullPointerException
    }
    println(nothingDef())
  }
}
