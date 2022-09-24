class FormatosTiendaOnline(){
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

    fun mostrarFormatoCatalogoOrdenado():String{
        var productoCatalogo:String = ""
        val productosOrdenados= stock.ordenarStockPorPrecio()
        for (producto in productosOrdenados){
            productoCatalogo += "\n ${producto.imgProducto}\n"+
                    " ${producto.descripcionProducto}\n ${producto.atributosDestacados}\n" +
                    " \uD83D\uDCB0 Price:${producto.precioProducto}\n Reference: ${producto.referenciaProducto}\n " +
                    ""
        }
        return productoCatalogo
    }

    fun mostrarFormatoProducto(producto: Producto): String {
        return ("${producto.imgProducto} \n" +
                "\uD83D\uDCB0 Price: ${producto.precioProducto} €.\n" +
                "2. Keep browsing products \n" +
                "Reference: ${producto.referenciaProducto} \n")
    }



}
