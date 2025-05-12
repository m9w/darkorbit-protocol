package com.darkorbit

interface UserMessageNoteInfoCommand : ProtocolPacket {
	var body: String
	var insertDate: String
	var noteId: Int
	var subject: String
}
