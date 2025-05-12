package com.darkorbit

interface UserMessageGetTargetCommand : ProtocolPacket {
	var commandList: MutableList<UserMessageTargetInfoCommand>
}
