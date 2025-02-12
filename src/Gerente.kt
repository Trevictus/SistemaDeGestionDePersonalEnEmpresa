class Gerente(nombre: String, edad: Int, private val bonus: Double, private val excentoImpuestos: Boolean = false, salarioBase: Double, porcentajeImpuestos: Double = 33.9): Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    override fun calcularSalario(): Double {
        return if(excentoImpuestos){
            salarioBase + bonus
        }else{
            (salarioBase-(salarioBase * porcentajeImpuestos/100)) + bonus
        }
    }

    override fun toString(): String {
        return super.toString() + " Excento de impuestos = $excentoImpuestos. Salario base = $salarioBase. Impuestos aplicados = $porcentajeImpuestos. Salario de: ${"%.2f".format(calcularSalario())}."
    }

    fun administrar(): String{
        return "$nombre, está administrando la empresa."

    }
}