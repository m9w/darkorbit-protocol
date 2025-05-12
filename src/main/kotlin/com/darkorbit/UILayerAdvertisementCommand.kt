package com.darkorbit

interface UILayerAdvertisementCommand : ProtocolPacket {
	var advertisementKey: String
	var alignment: AlignmentModule
	var closeable: Boolean
	var moveable: Boolean
}
