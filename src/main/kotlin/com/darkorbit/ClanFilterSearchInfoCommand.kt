package com.darkorbit

interface ClanFilterSearchInfoCommand : ProtocolPacket {
	var count: Int
	var list: MutableList<ClanInfoCommand>
}
