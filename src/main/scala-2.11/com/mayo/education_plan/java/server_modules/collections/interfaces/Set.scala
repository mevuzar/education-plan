package com.mayo.education_plan.java.server_modules.collections.interfaces

import com.mayo.education_plan.java.server_modules.collections.common_features.{DuplicateElements, Unsupported}
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait Set extends JavaCollection {
   override def features: scala.List[Feature] = List(Unsupported(DuplicateElements))
   override val description: String = "This interface models the mathematical set abstraction and is used to " +
     "represent sets, such as the cards comprising a poker hand, " +
     "the courses making up a student's schedule, or the processes running on a machine"
 }
