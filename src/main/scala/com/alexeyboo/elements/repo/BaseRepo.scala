package com.alexeyboo.elements.repo

import scala.collection.mutable.ArrayBuffer

trait BaseRepo[T] extends Any {
  def findAll: ArrayBuffer[T]

  def findById(id: Long): T

  def deleteById(id: Long): T

  def insert(entity: T): T
}
