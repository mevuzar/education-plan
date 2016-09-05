package com.mayo.education_plan.java.server_modules.collections
package implementations

import abstrct.AbstractSet
import interfaces.Set
import common_features.{ConstantTimePerformance, FailFastIterator, NullElements, SteadyOrderGuarantee, Supported, ThreadSafe, Unsupported}
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/28/16.
 */
trait HashSet extends AbstractSet with CollectionImplementation[Set] {
  override def features: List[Feature] = specification.features ::: List(
    ConstantTimePerformance,
    Supported(NullElements),
    Unsupported(SteadyOrderGuarantee),
    Unsupported(ThreadSafe),
    FailFastIterator
  )

  override def bestPractices: List[BestPractice] = List(
    DontSetInitialCapacitiyTooHigh,
    DontSetInitialCapacitiyTooHigh,
    UseSynchronizedSetInConcurrencySituations)
}

object DontSetInitialCapacitiyTooHigh extends BestPractice

object DontSetLoadFactorTooLow extends BestPractice

object UseSynchronizedSetInConcurrencySituations extends BestPractice