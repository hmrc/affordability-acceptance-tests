package uk.gov.hmrc.test.ui.mongo

import uk.gov.hmrc.test.ui.mongo.MongoHelper._
import org.mongodb.scala._

object MongoDriver {

  // Connect to the default server localhost on port 27017
  // Dropping Mongo like this will only work locally, unless you have config for other MongoClients.

  private val mongoClient: MongoClient = MongoClient()

  private val selfServiceTimeToPayFrontend: MongoDatabase = mongoClient.getDatabase("self-service-time-to-pay-frontend")
  private val timeToPayArrangement: MongoDatabase = mongoClient.getDatabase("time-to-pay-arrangement")

  def dropDatabases(): Unit = {
    selfServiceTimeToPayFrontend.drop().printResults()
    timeToPayArrangement.drop().printResults()
  }
}
