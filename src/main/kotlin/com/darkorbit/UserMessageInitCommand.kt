package com.darkorbit

interface UserMessageInitCommand : ProtocolPacket {
	var inboxCount: Int
	var noteLimit: Int
	var outboxCount: Int
	var unreadCount: Int
}
