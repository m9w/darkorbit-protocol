package com.darkorbit

interface ClanMessageListCommand : ProtocolPacket {
	var messageList: MutableList<ClanMessageInfoCommand>
}
