
fun main() {
    val input_num1 = print("숫자:")
    val num1 = readLine()!!.toInt()

    val input_op = print("연산 기호:")
    val operator = readLine()!!.toString()

    val input_num2 = print("숫자:")
    val num2 = readLine()!!.toInt()

    when (operator) {
        "+" -> {
            val add = Calculator(AddOperation()).operate(num1,num2)
            println("$num1 + $num2 결과는 : ${add}입니다.")
        }
        "-" -> {
            val sb = Calculator(SubstractOperation()).operate(num1,num2)
            println("$num1 - $num2 결과는 : ${sb}입니다.")
        }
        "*" -> {
            val mp = Calculator(MultiplyOperation()).operate(num1,num2)
            println("$num1 × $num2 결과는 : ${mp}입니다.")
        }
        "/" -> {
            val dv = Calculator(DivideOperation()).operate(num1,num2)
            println("$num1 ÷ $num2 결과는 : ${dv}입니다.")
        }
    }
}