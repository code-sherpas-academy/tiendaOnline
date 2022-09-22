class PantallaTientaOnline(){
  var formato= FormatosTiendaOnline()
     private set
    var stock = AlmacenGetionStock()

   fun verTiendaOnline(){
      println(formato.mostrarFormatoCatalogoOrdenado())
      println(preguntarPorReferenciaProducto())


   }

    fun preguntarPorReferenciaProducto():Any {
        println("Which product do you like to explore?\nEnter a produt's reference:")
        val referenciaABuscar = readln()
        var existeReferencia= stock.productosEnStock.filter{it.referenciaProducto == referenciaABuscar}
      if(existeReferencia != null){return existeReferencia}
        return error("referencia no encontrada en stock")
    }


    /*fun buscarReferenciaProducto(referenciaProducto){
        when(referenciaProducto){
            "2" -> formato.mostrarFormatoProducto()
        }
    }*/

}