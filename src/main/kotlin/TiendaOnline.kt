class TiendaOnline(){
 var stock = AlmacenGetionStock()
     private set

    fun mostrarFormatoCatalogo():String{
        var productoCatalogo:String = ""
        for (producto in stock.productosEnStock){
            productoCatalogo += "\n ${producto.imgProducto}\n"+
            " ${producto.descripcionProducto}\n ${producto.atributosDestacados}\n" +
            " \uD83D\uDCB0 Price:${producto.precioProducto}\n Reference: ${producto.referenciaProducto}\n " +
                    ""
    }
        return productoCatalogo
    }


}
