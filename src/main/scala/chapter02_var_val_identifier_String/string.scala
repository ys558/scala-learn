package chapter02_var_val_identifier_String

object string {
  def main(args: Array[String]): Unit = {
    // 格式化打印printf 及 占位符：%s (字符串), %d (整形),
    // 和python类似
    val name = "xyz"
    var age = 18
    printf("%s的年龄为%d\n", name, age)

    // 字符串模板: s"", f"", raw"", """""""
    println(s"${name}的年龄为：${age}")
    val num = 2.3456
    // %2.2f表示：整数部分保留2位，小数部分保留2位：
    println(f"the number is ${num}%2.2f") // the number is 2.35
    println(raw"the number is ${num}%2.2f") // the number is 2.3456%2.2f

    // """ """ 三引号多用于SQL语句
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin
    println(sql)
  }
}
