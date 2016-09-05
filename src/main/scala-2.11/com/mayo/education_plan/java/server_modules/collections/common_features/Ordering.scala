package com.mayo.education_plan.java.server_modules.collections.common_features

import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait Ordering

case object LIFO extends Ordering with Feature
case object FIFO extends Ordering with Feature
case object Ascending extends Ordering with Feature
case object Descending extends Ordering with Feature
case object SteadyOrderGuarantee extends Ordering with Feature
object NaturalOrdering extends Ordering with Feature
object CustomOrdering extends Ordering with Feature