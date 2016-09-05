package com.mayo.education_plan.java.server_modules.collections

import com.mayo.education_plan.java.abstrct.{Module, Specification}
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait JavaCollectionRoot extends Module with Specification {
  def use: scala.collection.immutable.List[String]

  def features: scala.collection.immutable.List[Feature]

  val description: String
  val codeSample: String
}
