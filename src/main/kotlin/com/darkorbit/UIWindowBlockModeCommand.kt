package com.darkorbit

interface UIWindowBlockModeCommand : ProtocolPacket {
	var blockWindow: Boolean
	var windowId: WindowIDModule
}
