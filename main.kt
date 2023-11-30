fun main() {
    val calc = Calculator()
    val input_num1 = print("숫자:")
    val num1 = readLine()!!.toInt()

    val input_op = print("연산 기호:")
    val operator = readLine()!!.toString()

    val input_num2 = print("숫자:")
    val num2 = readLine()!!.toInt()


    when (operator) {
        "+" -> {
            println("$num1 + $num2 결과는 : ${calc.addOperation(AddOperation(), num1, num2)}입니다.")
        }
        "-" -> {
            println("$num1 - $num2 결과는 : ${calc.substractOperation(SubstractOperation(), num1, num2)}입니다.")
        }
        "*" -> {
            println("$num1 × $num2 결과는 : ${calc.multiplyOperation(MultiplyOperation(), num1, num2)}입니다.")
        }
        "/" -> {
            println("$num1 ÷ $num2 결과는 : ${calc.divideOperation(DivideOperation(), num1, num2)}입니다.")
        }
    }
}