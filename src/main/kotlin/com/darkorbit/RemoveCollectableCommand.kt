package com.darkorbit

interface RemoveCollectableCommand : ProtocolPacket {
	var collected: Boolean
	var hash: String
}
