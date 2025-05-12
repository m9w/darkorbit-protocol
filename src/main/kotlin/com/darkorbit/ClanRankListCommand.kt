package com.darkorbit

interface ClanRankListCommand : ProtocolPacket {
	var ranks: MutableList<ClanRankInfoCommand>
}
