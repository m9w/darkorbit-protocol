package com.darkorbit

interface TitleFrenzyOwnerUpdateCommand : ProtocolPacket {
	var mapId: Int
	var titleId: Int
	var username: String
}
