package com.darkorbit

interface ContactBaseInfoCommand : ProtocolPacket {
	var avatarURL: String
	var type: Int
	var userId: Int
	var userName: String
}
