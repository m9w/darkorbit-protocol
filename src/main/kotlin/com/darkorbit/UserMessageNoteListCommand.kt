package com.darkorbit

interface UserMessageNoteListCommand : ProtocolPacket {
	var noteInfoCommandList: MutableList<UserMessageNoteInfoCommand>
}
