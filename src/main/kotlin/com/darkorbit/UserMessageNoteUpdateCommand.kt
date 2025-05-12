package com.darkorbit

interface UserMessageNoteUpdateCommand : ProtocolPacket {
	var noteInfoCommandList: MutableList<UserMessageNoteInfoCommand>
	var success: Boolean
	var textCommand: BaseStackCommand
	var titleCommand: BaseStackCommand
}
