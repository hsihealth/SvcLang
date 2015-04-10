package svclang.compiler.listeners

import svclang.compiler.model.{Service, ServiceSection}
import svclang.parser.SvcLangParser.{ServiceContext, ServiceSectionContext}

trait ServiceListener {
  this : SvcLangListener =>

  def service():Option[Service] = Option(currentService).flatten

  protected var currentService : Option[Service] = None
  protected var currentServiceSection : Option[ServiceSection] = None

  override def enterService(ctx: ServiceContext): Unit = {
    val svc = new Service(ctx.serviceDeclr().Identifier())
    beginService(svc)
  }

  override def enterServiceSection(ctx:ServiceSectionContext): Unit = {
    beginSection(new ServiceSection(ctx.Section().getText.replace("##","").trim(),currentService))
  }

  protected def beginService(service:Service):Unit = {
    stack.push(service)
    currentService = Some(service)
  }

  private def beginSection(section:ServiceSection) = {
    currentService.foreach{ svc =>
      svc.addSection(section)
      currentServiceSection.foreach(endSection)
      currentServiceSection = Some(section)
      stack.push(section)
    }
  }

  private def endSection(section:ServiceSection) = {
    currentServiceSection = None
    stack.pop()
  }
}
