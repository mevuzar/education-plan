package com.mayo.education_plan.java.server_modules.collections.interfaces

import com.mayo.education_plan.java.server_modules.collections.common_features.FIFO
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait Queue extends JavaCollection{
   override def features: scala.List[Feature] = List(FIFO)
   override val description: String = "a collection used to hold multiple elements prior to processing. " +
     "Besides basic Collection operations, a Queue provides additional insertion, extraction, and inspection operations."
 }
