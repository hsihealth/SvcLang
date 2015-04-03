package svclang.model.nodes

class ServiceSection(name:String) extends ServiceNode(name)
                                     with HasDocumentation
                                     with HasSettings
                                     with HasTypeAliases
                                     with HasMessages
{
}

