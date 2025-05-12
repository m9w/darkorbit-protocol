package com.darkorbit

interface CommandCenterInfoCommand : ProtocolPacket {
	var ids: MutableList<CommandCenterNewsModule>
}
