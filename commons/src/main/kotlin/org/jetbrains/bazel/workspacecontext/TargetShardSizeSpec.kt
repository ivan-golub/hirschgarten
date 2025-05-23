package org.jetbrains.bazel.workspacecontext

import org.jetbrains.bazel.executioncontext.api.ExecutionContextSingletonEntity

data class TargetShardSizeSpec(override val value: Int) : ExecutionContextSingletonEntity<Int?>()
