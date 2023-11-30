class Calculator{
    fun addOperation(add: AddOperation,num1:Int,num2:Int): Double {
        return add.operate(num1,num2)
    }
    fun substractOperation(sb: SubstractOperation, num1:Int, num2:Int): Double {
        return sb.operate(num1,num2)
    }
    fun multiplyOperation(mp: MultiplyOperation, num1:Int, num2:Int): Double {
        return mp.operate(num1,num2)
    }
    fun divideOperation(dv: DivideOperation, num1:Int, num2:Int): Double {
        return dv.operate(num1,num2)
    }
}