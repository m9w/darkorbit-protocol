package com.darkorbit

interface UnstableModuleRecycleResultCommand : ProtocolPacket {
	var itemId: Int
	var shardCommand: UnstableModulesShardCommand
}
