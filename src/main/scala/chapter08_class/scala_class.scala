package chapter08_class

import scala.beans.BeanProperty

class scala_class {
  // 普通属性属性:
  // scala中没有public关键字，只有private关键字：
  private var name: String = "张三"

  /* *
  * Java Bean：
  * 一个Java class中，如果读写方法符合以下这种命名规范：
  * // 读方法:
  * public Type getXyz()
  * // 写方法:
  * public void setXyz(Type value)
  * 那么这种class被称为JavaBean：
  * */

  // Bean属性：
  // scala可引入 @BeanProperty 注解引进java bean
  // ! _ 下划线代表初始值
  @BeanProperty
  var publicName: String = "张三"
  var age: Int = _
  var gender: String = _

}
