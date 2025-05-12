package com.darkorbit

interface ClanMemberListCommand : ProtocolPacket {
	var memberList: MutableList<ClanMemberInfoCommand>
}
