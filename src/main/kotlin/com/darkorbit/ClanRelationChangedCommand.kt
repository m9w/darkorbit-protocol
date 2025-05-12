package com.darkorbit

interface ClanRelationChangedCommand : ProtocolPacket {
	var clanId: Int
	var newRelation: ClanRelationModule
	var userId: Int
}
