package svclang.runtime.model

trait TypeDef extends ServiceElement {
  val COLLECTION_TYPES = List("map","list")
  def isCollectionType: Boolean =  COLLECTION_TYPES.contains(name.toLowerCase)
  def parent = None
}
