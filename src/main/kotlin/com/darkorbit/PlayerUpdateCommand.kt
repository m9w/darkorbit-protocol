package com.darkorbit

interface PlayerUpdateCommand : ProtocolPacket {
	var updates: MutableList<PlayerAttributeModule>
}
