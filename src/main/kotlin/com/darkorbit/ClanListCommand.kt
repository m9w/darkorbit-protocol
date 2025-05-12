package com.darkorbit

interface ClanListCommand : ProtocolPacket {
	var infoCommandList: MutableList<ClanNameTagInfoCommand>
	var type: Int
}
