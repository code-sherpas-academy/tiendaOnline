class AlmacenGetionStock {
    var productosEnStock: MutableList<Producto> = mutableListOf<Producto>(Producto(1,"W2C",300.99,"Glamorous panoramic television, 13 inches", "With this panoramic television, your friday nights will be boring no more.","\uD83D\uDCFA"), Producto(2,"X4A" , 1003.00,"Untuned musical keyboard, 4 octaves", "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home\nand your neighbour will be ready to move to a building far away from you. ", "\uD83C\uDFB9" ), Producto(3,"W2C",300.99,"Glamorous panoramic television, 13 inches", "With this panoramic television, your friday nights will be boring no more.","\uD83D\uDCFA"), Producto(3,"W2C",2300.99,"Glamorous panoramic television, 13 inches", "With this panoramic television, your friday nights will be boring no more.","\uD83D\uDCFA"))
        private set

    fun ordenarStockPorPrecio():List<Producto>{
      productosEnStock.sortBy{ producto -> producto.precioProducto }
      return productosEnStock
    }


    fun buscarPoducto(referenciaABuscar: String): Producto{
        for (producto in productosEnStock){
            if (referenciaABuscar == producto.referenciaProducto) return producto
        }
        throw IllegalArgumentException ("Referencia no encontrada")
    }

}




