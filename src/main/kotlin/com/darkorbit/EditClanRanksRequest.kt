package com.darkorbit

interface EditClanRanksRequest : ProtocolPacket {
	var ranks: MutableList<ClanRankInfoCommand>
}
