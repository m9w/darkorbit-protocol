package com.darkorbit

interface MessageCommand : ProtocolPacket {
	var displayStyle: DisplayStyle
	var displayTarget: DisplayTarget
	var messageModule: MessageModule
}
