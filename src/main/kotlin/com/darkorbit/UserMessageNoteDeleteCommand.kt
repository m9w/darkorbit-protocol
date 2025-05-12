package com.darkorbit

interface UserMessageNoteDeleteCommand : ProtocolPacket {
	var commandList: MutableList<UserMessageNoteInfoCommand>
	var noteId: Int
	var success: Boolean
	var textCommand: BaseStackCommand
	var titleCommand: BaseStackCommand
}
