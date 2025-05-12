package com.darkorbit

interface ClanSearchNameTagCommand : ProtocolPacket {
	var infoCommandList: MutableList<ClanNameTagInfoCommand>
	var lookup: String
}
