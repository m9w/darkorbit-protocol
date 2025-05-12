package com.darkorbit

interface AssemblyRecipeModule : ProtocolPacket {
	var recipeLootId: String
	var status: AssemblyRecipeStatusModule
	var targetItemId: Long
	var type: AssemblyRecipeTypeModule
}
