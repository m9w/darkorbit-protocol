package com.darkorbit

interface CollectionBeamStartCommand : ProtocolPacket {
	var duration: Int
	var isPlayer: Boolean
	var mapObjectId: Int
}
