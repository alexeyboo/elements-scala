package com.alexeyboo.elements.repo
import com.alexeyboo.elements.domain.Element
import com.alexeyboo.elements.storage.Memory

import scala.collection.mutable.ArrayBuffer

class ElementMemoryRepo extends ElementRepo {
  override def findAll: ArrayBuffer[Element] = Memory.elements

  override def findById(id: Long): Element = {
    for (element <- Memory.elements) {
      if (element.id == id) {
        return element
      }
    }
    null
  }

  override def deleteById(id: Long): Element = {
    for (element <- Memory.elements) {
      if (element.id == id) {
        //couldn't find any 'remove' methods in collections
      }
    }
    null
  }

  override def insert(entity: Element): Element = {
    Memory.elements += entity
    entity
  }
}
