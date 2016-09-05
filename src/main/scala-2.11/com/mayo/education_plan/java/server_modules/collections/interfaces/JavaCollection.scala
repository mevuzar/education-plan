package com.mayo.education_plan.java.server_modules.collections.interfaces

import com.mayo.education_plan.java.server_modules.collections.JavaCollectionRoot
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait JavaCollection extends JavaCollectionRoot {
  override def features: scala.List[Feature] = List(GenerateStream, GenerateParallelStream)

  override val description: String =
    """The Collection interface is used to pass around collections of objects where
      |maximum generality is desired. For example, by convention all general-purpose collection implementations have a
      |constructor that takes a Collection argument. This constructor, known as a conversion constructor,
      |initializes the new collection to contain all of the elements in the specified collection,
      |whatever the given collection's subinterface or implementation type.
      |In other words, it allows you to convert the collection's type.""".stripMargin
}

case object GenerateStream extends Feature

case object GenerateParallelStream extends Feature

object CollectionOperations{
  trait Operation
  case object AllOperations extends Operation
  case object Add extends Operation
  case object Remove extends Operation
  case object Contains extends Operation
  case object Size extends Operation
}