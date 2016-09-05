package com.mayo.education_plan.java.server_modules.collections.implementations

import com.mayo.education_plan.java.abstrct.{Implementation, Specification}
import com.mayo.education_plan.java.server_modules.collections.JavaCollectionRoot
import com.mayo.whatis.mean.Meaning

/**
 * @author yoav @since 7/28/16.
 */
trait CollectionImplementation[Spec <: Specification] extends Implementation[Spec] with JavaCollectionRoot {
  def bestPractices: List[BestPractice]
}

trait BestPractice extends Meaning
