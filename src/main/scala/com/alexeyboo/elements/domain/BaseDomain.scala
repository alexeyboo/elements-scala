package com.alexeyboo.elements.domain

abstract class BaseDomain {
  var id: Long = {
    BaseDomain.id += 1
    BaseDomain.id
  }
}
object BaseDomain {
  var id: Long = 0
}
