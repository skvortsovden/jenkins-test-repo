  #!/usr/bin/groovy

import groovy.text.markup.MarkupTemplateEngine

def generateReport(String reportTemplatePath, String gatlingReportFilePath, Object model) {
  println(reportTemplatePath)
  println(gatlingReportFilePath)
  println(model)
  // def reportTemplate = new File(reportTemplatePath)
  def gatlingReportFile = new File(gatlingReportFilePath)
  def reportHtml = new MarkupTemplateEngine().createTemplate(new File(reportTemplatePath)).make(model)
  gatlingReportFile.append(reportHtml.toString())

  println(reportTemplate)
  println(gatlingReportFile)
}

return this
