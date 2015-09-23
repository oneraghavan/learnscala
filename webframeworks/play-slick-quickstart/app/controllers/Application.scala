package controllers

import models._
import play.api.db.slick.DBAction
import play.api.{Configuration, Play}
import play.api.data.Forms._
import play.api.data._
import play.api.libs.json.Json
import play.api.libs.json.Json._
import play.api.mvc._
import slick.driver.PostgresDriver.api._

object Application extends Controller{

  //create an instance of the table
  val cats = TableQuery[CatsTable] //see a way to architect your app in the computers-database-slick sample

  private val config: Option[Configuration] = Play.current.configuration.getConfig("db.default.url")
  val db = Database.forURL(config,driver=jdbcDriver)
  //JSON read/write macro
  implicit val catFormat = Json.format[Cat]

  def index = DBAction { implicit rs =>
    Ok(cats.run)
  }

  val catForm = Form(
    mapping(
      "name" -> text(),
      "color" -> text()
    )(Cat.apply)(Cat.unapply)
  )

  def insert = DBAction { implicit rs =>
    val cat = catForm.bindFromRequest.get
    cats.map(p => (p.name)).insert

    Redirect(routes.Application.index)
  }

  def jsonFindAll = DBAction { implicit rs =>
    Ok(toJson(cats.list))
  }

  def jsonInsert = DBAction(parse.json) { implicit rs =>
    rs.request.body.validate[Cat].map { cat =>
        cats.insert(cat)
        Ok(toJson(cat))
    }.getOrElse(BadRequest("invalid json"))    
  }
  
}
