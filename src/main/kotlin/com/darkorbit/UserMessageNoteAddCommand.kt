package com.darkorbit

interface UserMessageNoteAddCommand : ProtocolPacket {
	var commandList: MutableList<UserMessageNoteInfoCommand>
	var success: Boolean
	var textCommand: BaseStackCommand
	var titleCommand: BaseStackCommand
}
