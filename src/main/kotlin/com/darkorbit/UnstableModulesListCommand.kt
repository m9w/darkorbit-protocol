package com.darkorbit

interface UnstableModulesListCommand : ProtocolPacket {
	var allModules: MutableList<UnstableModuleModule>
	var isDiscountRunning: Boolean
	var resetUI: Boolean
	var shardCommand: UnstableModulesShardCommand
}
