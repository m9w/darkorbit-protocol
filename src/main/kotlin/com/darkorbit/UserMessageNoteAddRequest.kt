package com.darkorbit

interface UserMessageNoteAddRequest : ProtocolPacket {
	var body: String
	var subject: String
}
