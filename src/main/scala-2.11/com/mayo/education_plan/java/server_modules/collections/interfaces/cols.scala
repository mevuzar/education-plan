package com.mayo.education_plan.java.server_modules.collections.interfaces


import java.awt.Color
import java.util._

object cols extends App {
  val colors = new ArrayList[Color]
  colors.add(Color.RED)
  colors.add(Color.RED)
  colors.add(Color.BLUE)
  colors.add(Color.BLACK)
  colors.add(Color.GRAY)
  colors.add(Color.YELLOW)
  val stream = colors.stream().toArray.toList.filter(e => e == Color.RED)
  colors.iterator().next()
  colors.iterator().remove()
  println(colors)
}