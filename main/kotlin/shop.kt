class shop(val clientes: MutableList<client>) {

fun addClientes(cliente: client){
    clientes.add(cliente)
}
fun removeCliente(){
    clientes.removeAt(0)
}

fun showClientes(){
    for (cliente in clientes){
        println(cliente)
    }
}
fun printCliente(){
    println("hola clientes")
}
}