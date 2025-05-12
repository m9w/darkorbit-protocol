package com.darkorbit

interface UIWindowUpdateRequest : ProtocolPacket {
	var height: Int
	var itemId: String
	var maximized: Boolean
	var posX: Int
	var posY: Int
	var width: Int
}
