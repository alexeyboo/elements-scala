package com.alexeyboo.elements.domain

class Element(var name: String, var size: Int) extends BaseDomain {
  def this() {
    this(Element.DEFAULT_NAME, Element.DEFAULT_SIZE)
  }

  override def toString = s"Element($id, $name, $size)"
}

object Element {
  var DEFAULT_NAME: String = _
  var DEFAULT_SIZE: Int = _
}