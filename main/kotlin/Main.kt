fun main(args: Array<String>) {



    val cliente1= client("22222222","raul",35)
    val cliente2= client("11111111","pedro",32)
    val listaCliente= mutableListOf<client>()
    val listaCompras= shop(listaCliente)
    listaCompras.addClientes(cliente1)
    listaCompras.addClientes(cliente2)
    listaCompras.showClientes()
    listaCompras.removeCliente()
    println("despues de borrar cliente")
    listaCompras.showClientes()

}