package com.darkorbit

interface GroupMemberUpdateCommand : ProtocolPacket {
	var playerId: Int
	var updates: MutableList<PlayerAttributeModule>
}
