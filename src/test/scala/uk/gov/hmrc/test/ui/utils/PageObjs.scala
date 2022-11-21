//package uk.gov.hmrc.test.ui.utils
//
//import uk.gov.hmrc.test.ui.pages.BasePage
//import uk.gov.hmrc.test.ui.pages.journey.affordability.CannotSetupDDPage
//
//import java.io.File
//
//object PageObjs {
//
//  private val pagesDir: File = new File("src/test/scala/directdebits/pages")
//  private val endExt: List[String] = List("Page.scala")
//  private val pages: List[BasePage] = FileSys.getAllFilesUnderDir(pagesDir, endExt).flatMap(f => convertFileToBasePage(f))
//
//  private def convertFileToBasePage(file: File): Option[BasePage] = {
//    file.getName match {
//      case "CannotSetupDDPage.scala"      => Some(CannotSetupDDPage)
//      case _                                       => None
//    }
//  }
//
//  def fromString(pageStr: String): BasePage = {
//    def pageName: String = pageStr.replaceAll(" ", "") + "Page"
//    pages.find(_.toString.equalsIgnoreCase(pageName))
//      .fold(throw new Exception(s"Page Object not found for [$pageStr]"))(p => p)
//  }
//
//}
