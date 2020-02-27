package com.alexeyboo.elements.storage

import com.alexeyboo.elements.domain.Element

import scala.collection.mutable.ArrayBuffer

object Memory {
  var elements: ArrayBuffer[Element] = ArrayBuffer[Element]()
}
