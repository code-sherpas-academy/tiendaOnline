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

    fun mostrarFormatoProducto(producto: Producto){
        println(producto.imgProducto)
        println("\uD83D\uDCB0 Price: ${producto.precioProducto} €.")
        println("Reference: ${producto.referenciaProducto}")
       // println("${storeToShow.howManyOfThisProduct(product.showProductReference())} left.\n")
       // println("SUMMARY:")
        //println("${product.showProductDescription()}\n")
        //println("DESCRIPTION:\n" +
                //"${product.showProductAttribute()}\n" +
                //"${product.showLongDescription()}\n")
    }



}
