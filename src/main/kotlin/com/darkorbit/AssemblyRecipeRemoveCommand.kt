package com.darkorbit

interface AssemblyRecipeRemoveCommand : ProtocolPacket {
	var recipes: MutableList<AssemblyRecipeKeyModule>
}
