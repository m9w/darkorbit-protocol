package com.darkorbit

interface AssemblyRecipeReadyToCollectStatusModule : AssemblyRecipeStatusModule {
	var buildAmount: Long
	var prevBuildCount: Int
}
