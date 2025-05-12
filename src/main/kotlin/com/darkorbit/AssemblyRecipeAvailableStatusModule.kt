package com.darkorbit

interface AssemblyRecipeAvailableStatusModule : AssemblyRecipeStatusModule {
	var currentBuildCount: Int
	var isNew: Boolean
}
