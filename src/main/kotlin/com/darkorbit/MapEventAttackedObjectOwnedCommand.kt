package com.darkorbit

interface MapEventAttackedObjectOwnedCommand : ProtocolPacket {
	var ownedObjectId: Int
	var ownerId: Int
}
