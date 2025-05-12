package com.darkorbit

interface ClanApplyInfoListCommand : ProtocolPacket {
	var applyClanInfoCommandList: MutableList<ClanApplyInfoCommand>
}
