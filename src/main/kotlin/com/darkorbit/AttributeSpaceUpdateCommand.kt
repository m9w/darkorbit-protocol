package com.darkorbit

interface AttributeSpaceUpdateCommand : ProtocolPacket {
	var spaceLeft: Int
	var spaceType: SpaceType
}
