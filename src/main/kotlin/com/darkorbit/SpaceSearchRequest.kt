package com.darkorbit

interface SpaceSearchRequest : ProtocolPacket {
	var action: SpaceSearchRequestAction
	var count: Int
	var id: Int
}
