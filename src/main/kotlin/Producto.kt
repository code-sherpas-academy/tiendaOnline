class Producto(id: Int, nombre: String, referencia: String, precio: Double, descriptionCorta: String, atributosDestacados: String, img: String) {

   private var idProducto = id
   var nombreProducto = nombre
   private set
   var referenciaProducto = referencia
   private set//solo ocultamos la reasignación del campo
   var precioProducto = precio
   private set
   var descripcionProducto = descriptionCorta
   private set
   var atributosDestacados = atributosDestacados
   private set
   var imgProducto = img
   private set



}