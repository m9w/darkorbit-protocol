package com.darkorbit

interface ActivePerkUpdateCommand : ProtocolPacket {
	var activePerkModuleList: MutableList<ActivePerkModule>
}
