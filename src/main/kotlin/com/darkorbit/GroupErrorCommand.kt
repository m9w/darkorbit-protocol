package com.darkorbit

interface GroupErrorCommand : ProtocolPacket {
	var type: GroupErrorCommandErrorType
}
