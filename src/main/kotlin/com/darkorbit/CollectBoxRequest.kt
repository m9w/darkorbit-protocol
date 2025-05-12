package com.darkorbit

interface CollectBoxRequest : ProtocolPacket {
	var boxX: Int
	var boxY: Int
	var itemHash: String
	var posX: Int
	var posY: Int
}
