package com.darkorbit

interface TechStatusCommand : ProtocolPacket {
	var techStatusItems: MutableList<TechStatusItemModule>
}
