package com.darkorbit

interface KillScreenUpdateCommand : ProtocolPacket {
	var options: MutableList<KillScreenOptionModule>
}
