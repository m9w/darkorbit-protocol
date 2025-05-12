package com.darkorbit

interface CollectionBeamStopCommand : ProtocolPacket {
	var isPlayer: Boolean
	var mapObjectId: Int
}
