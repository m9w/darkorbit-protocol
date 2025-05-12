package com.darkorbit

interface HintWindowClosedRequest : ProtocolPacket {
	var closedWindow: HintWindowModule
	var wasOpenedFromArchive: Boolean
}
