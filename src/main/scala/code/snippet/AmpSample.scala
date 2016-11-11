package code
package snippet

import code.snippet

import code.lib.DependencyFactory

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import code.lib._
import Helpers._

class AmpSample {

  case class Book(title: String, year: String, author: String)

  val book = Book ("L'Inferno", "1304", "Dante Alighieri" )



  def render = {

    ".title *" #> book.title &
      ".year *" #> book.year &
    ".author *" #> book.author

  }

}

