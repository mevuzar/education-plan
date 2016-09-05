package com.mayo.education_plan.java.server_modules.collections
package common_features

import com.mayo.education_plan.java.server_modules.collections.interfaces.CollectionOperations.Operation
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 8/1/16.
 */
trait CollectionFeature extends Feature{
  private val operations = scala.collection.mutable.Set.empty[Operation]

  def operationsView = operations.view
  def worksOn(ops: Operation*): CollectionFeature = {
    ops.foreach(operations.add)
    this
  }
}
