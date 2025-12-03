package com.darkorbit

interface CannonUnstableModuleModule : UnstableModuleModule {
	var upgradeLevel: Int
	var upgradeReturns: MutableList<LootModule>
}
