package com.darkorbit

interface AssemblyRecipeStatusUpdateCommand : ProtocolPacket {
	var lootId: String
	var status: AssemblyRecipeStatusModule
	var targetItemId: Long
}
