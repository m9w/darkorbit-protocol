package com.darkorbit

interface UnstableModuleRestabilizeResultCommand : ProtocolPacket {
	var itemId: Long
	var newModule: UnstableModuleModule
	var oldModule: UnstableModuleModule
	var success: Boolean
}
