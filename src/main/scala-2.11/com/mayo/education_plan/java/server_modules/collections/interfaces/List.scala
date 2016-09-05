package com.mayo.education_plan.java.server_modules.collections.interfaces

import com.mayo.education_plan.java.server_modules.collections.common_features.{DuplicateElements, Supported}
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait List extends JavaCollection {
   override def features: scala.List[Feature] = List(Supported(DuplicateElements))
   override val description: String = "an ordered collection (sometimes called a sequence)."
 }
