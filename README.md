# 说明：
 * - 使用 Calendar，兼容Android低版本。
 * - 支持传入时区，便于测试与多时区的应用场景。
   - 文件路径：app/src/main/java/com/example/my_greeter
   - MainActivity 有实现测试代码 

# 思考:
 * - 抱歉，因为对 python以及php语言不够熟悉，大致看了下 my_greeter_test.py 测试类，发现一些小问题：
   - 1、是
   - 2、测试的代码不全面：只测试了 greeting() 方法是否返回了非空字符串，没有验证具体的时间逻辑是否正确；
   -    没有测试 6:00、12:00、18：00 这几个关键时间点
   -    缺少测试异常情况 比如无效的输入
