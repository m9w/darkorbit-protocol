package com.darkorbit

interface UserMessageNoteUpdateRequest : ProtocolPacket {
	var body: String
	var noteId: Int
	var subject: String
}
