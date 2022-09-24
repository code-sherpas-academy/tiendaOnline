class PantallaTientaOnline(){
  var formato= FormatosTiendaOnline()
     private set
    var stock = AlmacenGetionStock()
        private set
   fun verTiendaOnline(){
      println(formato.mostrarFormatoCatalogoOrdenado())
      println(formato.mostrarFormatoProducto(stock.buscarPoducto(preguntarPorReferenciaProducto())))
      println(seguirPrograma())

   }

    fun preguntarPorReferenciaProducto(): String{
        println("Which product do you like to explore?\n Enter a produt's reference:\n")
        val referenciaABuscar = readln()
        return referenciaABuscar
    }

    fun seguirPrograma():String{
        println("¿What would you like to do next?\n" +
                "1. Add product to cart\n" +
                "2. Keep browsing products\n")
            val respuestaProximoPaso = readln()
        return when(respuestaProximoPaso){
            "2"-> formato.mostrarFormatoCatalogoOrdenado()
            "1"-> "¡ hasta pronto !"
            else -> ({ println(" error al marcar el siguiente paso ")}).toString()
        }
    }





}