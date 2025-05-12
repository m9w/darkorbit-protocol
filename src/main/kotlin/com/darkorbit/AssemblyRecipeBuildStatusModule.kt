package com.darkorbit

interface AssemblyRecipeBuildStatusModule : AssemblyRecipeStatusModule {
	var buildAmount: Long
	var prevBuildCount: Int
	var remainingTimeMillis: Long
}
