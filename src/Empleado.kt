open class Empleado(nombre: String, edad: Int, var salarioBase: Double, val porcentajeImpuestos: Double = 10.0): Persona(nombre, edad) {


    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuestos: Int): this(nombre, edad, salarioBase.toDouble(), porcentajeImpuestos.toDouble())

    open fun calcularSalario(): Double{
        salarioBase -= salarioBase * (porcentajeImpuestos / 100)

        return salarioBase
    }

    override fun toString(): String {
        return super.toString() + " Salario: ${"%.2f".format(calcularSalario())}."
    }

    fun trabajar(): String{
        return "$nombre está trabajando en la empresa."

    }
}