fun main(){
    val persona = Persona("Joseico", 32)
    val empleado = Empleado("Miguel", 30, 1200, 20)
    val gerente = Gerente("Víctor", 33, 160.0, false, 1600.0)

    println(persona.celebrarCumple())
    println(persona.toString())

    println(empleado.calcularSalario())
    println(empleado.trabajar())
    println(empleado.toString())

    println(gerente.administrar())
    println(gerente.calcularSalario())
    println(gerente.toString())
}