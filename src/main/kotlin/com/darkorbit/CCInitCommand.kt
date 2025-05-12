package com.darkorbit

interface CCInitCommand : ProtocolPacket {
	var commands: MutableList<CCommandModule>
}
