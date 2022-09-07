class AlmacenGetionStock {
    var productosEnStock: MutableList<Producto> = mutableListOf<Producto>()
        private set

    fun crearProductos():String {
        val tvImg = "\uD83D\uDCFA"
        val tvNombre = "televisión"
        val tvDescripcionCorta = "Glamorous panoramic television, 13 inches"
        val tvAtributoDestacado = "With this panoramic television, your friday nights will be boring no more."
        val tvPrecio= 300.99
        val tvRef = "tvW2C"
        val tvId = 1
        val tv: Producto = Producto(tvId,tvNombre, tvRef, tvPrecio, tvDescripcionCorta, tvAtributoDestacado,tvImg )

        val organoImg = "\uD83C\uDFB9"
        val organoNombre = "órgano eléctrico"
        val organoDescripcionCorta = "Untuned musical keyboard"
        val organoAtributoDestacado = "4 octaves\n" +
                "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home and your neighbour will be ready to move to a building far away from you. 300.99"
        val organoPrecio= 1003.00
        val organoRef = "orgX4A"
        val organoId = 2
        val organo: Producto = Producto(organoId,organoNombre,organoRef, organoPrecio,organoDescripcionCorta , organoAtributoDestacado, organoImg )

        val guitarImg = "\uD83C\uDFB8"
        val guitarNombre = "guitar"
        val guitarDescripcionCorta = "The guitar is a fretted musical instrument that typically has six strings."
        val guitarAtributoDestacado = "It is usually held flat against the player's body and played by strumming or plucking the strings with the dominant hand."
        val guitarPrecio= 1100.99
        val guitarRef = "guitarW2C"
        val guitarId = 3
        val guitar: Producto = Producto(guitarId,guitarNombre, guitarRef, guitarPrecio, guitarDescripcionCorta, guitarAtributoDestacado,guitarImg )
        productosEnStock.add(organo)
        productosEnStock.add(tv)
        productosEnStock.add(guitar)

        return "${productosEnStock.size} productos añadidos a stock con éxito"
    }

    fun ordenarStockPorPrecio(){
        productosEnStock.sortByDescending { producto -> producto.precioProducto }
    }


}




