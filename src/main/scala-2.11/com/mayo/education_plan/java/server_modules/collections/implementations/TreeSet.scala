package com.mayo.education_plan.java.server_modules.collections.implementations

import com.mayo.education_plan.java.server_modules.collections.abstrct.AbstractSet
import com.mayo.education_plan.java.server_modules.collections.common_features.{Unsupported, CustomOrdering, FailFastIterator, LogOfNCost, NaturalOrdering, Supported, ThreadSafe}
import com.mayo.education_plan.java.server_modules.collections.interfaces.CollectionOperations._
import com.mayo.education_plan.java.server_modules.collections.interfaces.NavigableSet
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/28/16.
 */
trait TreeSet extends AbstractSet with CollectionImplementation[NavigableSet] {
  override def features: List[Feature] = List(
    NaturalOrdering,
    Supported(CustomOrdering),
    LogOfNCost worksOn(Add, Remove, Contains),
    Unsupported(ThreadSafe),
    FailFastIterator)
}
