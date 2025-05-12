package com.darkorbit

interface LoginErrorCommand : ProtocolPacket {
	var errorCode: LoginErrorCommandErrorCode
	var mapId: Int
}
