package com.darkorbit

interface LogoutCommand : ProtocolPacket {
	var command: CommandType
}
