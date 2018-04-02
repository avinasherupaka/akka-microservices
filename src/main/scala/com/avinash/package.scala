package com

import akka.actor.ActorRef
import scala.collection.immutable.Map

package object avinash {
  type Services = Map[String, ActorRef]
  object Services {
    def empty[A, B]: Map[A, B] = Map.empty
  }
}
