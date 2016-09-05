package com.mayo.education_plan.java.server_modules.collections.common_features

import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/28/16.
 */

trait Performance

object ConstantTimePerformance extends Performance with Feature
object LogOfNCost extends Performance with CollectionFeature
